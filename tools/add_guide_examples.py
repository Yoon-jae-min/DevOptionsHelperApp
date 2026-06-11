#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import re
import json
from pathlib import Path

STRINGS_PATH = Path(r"C:\Users\androidJM\Desktop\Project\Apps\DevOptionsHelper\app\src\main\res\values\strings.xml")
MARKER = "【사용 예시】"
EXAMPLES_PATH = Path(__file__).with_name("guide_examples.json")

EXAMPLE_BLOCK_PATTERN = re.compile(
    r"(?:(?:\\n\\n)|(?:\n\n))?【사용 예시】(?:\\n|\n)(?:(?:\\n\\n)?· .*?(?:(?:\\n\\n)|(?:\n\n)|(?:\\n)|\n|$))+",
    re.DOTALL,
)


def format_examples(text: str) -> str:
    lines = [line.strip() for line in text.splitlines() if line.strip()]
    return "\n\n".join(lines)


def escape_xml_string(text: str) -> str:
    return text.replace("\\", "\\\\").replace("\n", "\\n").replace("'", "\\'")

PATTERN = re.compile(r'<string name=\"(guide_[^\"]+_desc)\">(.*?)</string>', re.DOTALL)


def should_skip(desc_name: str) -> bool:
    base = desc_name[:-5]
    return base.startswith("guide_section_") or base in {"guide_card", "guide_intro"}


def load_examples() -> dict[str, str]:
    raw = EXAMPLES_PATH.read_text(encoding="utf-8")
    loaded = json.loads(raw)
    if not isinstance(loaded, dict):
        raise ValueError("guide_examples.json must contain an object mapping")
    return {str(k): str(v) for k, v in loaded.items()}


def strip_example_block(content: str) -> str:
    return EXAMPLE_BLOCK_PATTERN.sub("", content).rstrip()


def add_examples(xml_text: str, examples: dict[str, str]) -> tuple[str, int, list[str]]:
    updated = 0
    missing_examples: list[str] = []

    def replacer(match: re.Match[str]) -> str:
        nonlocal updated
        desc_name = match.group(1)
        content = match.group(2)

        if should_skip(desc_name):
            return match.group(0)

        base_key = desc_name[:-5]
        example_text = examples.get(base_key)
        if not example_text:
            missing_examples.append(base_key)
            return match.group(0)

        updated += 1
        cleaned_content = strip_example_block(content).rstrip("\\n")
        formatted_examples = escape_xml_string(format_examples(example_text))
        new_content = f"{cleaned_content}\\n\\n{MARKER}\\n{formatted_examples}"
        return f'<string name=\"{desc_name}\">{new_content}</string>'

    new_xml = PATTERN.sub(replacer, xml_text)
    return new_xml, updated, sorted(set(missing_examples))


def main() -> int:
    examples = load_examples()
    original = STRINGS_PATH.read_text(encoding="utf-8")
    updated_xml, updated_count, missing = add_examples(original, examples)
    STRINGS_PATH.write_text(updated_xml, encoding="utf-8")
    print(f"updated={updated_count}")
    if missing:
        print("missing_examples=" + ",".join(missing))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
