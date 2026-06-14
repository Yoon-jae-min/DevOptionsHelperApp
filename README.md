# 개발자 옵션 도우미 (DevOptionsHelper)

**버전 1.2.0** · `com.devoptionshelper`

개발자 옵션 설정 화면으로 바로 이동하고, 각 메뉴가 무엇인지 설명해 주는 Android 앱입니다. 원하면 앱 안에서 간편하게 개발자 옵션을 켜고 끌 수도 있습니다.

## 기능

- **설정 화면 열기 (기본)**: 권한 없이 시스템 개발자 옵션(또는 설정) 화면으로 바로 이동합니다. 플레이 스토어에서 받은 사용자도 바로 사용할 수 있습니다.
- **간편 켜기/끄기 (선택)**: PC에서 ADB로 권한을 한 번 부여한 경우, 앱 내 스위치로 개발자 옵션을 켜거나 끕니다.
- **메뉴 설명 가이드**: 삼성 갤럭시(One UI) 개발자 옵션을 바탕으로 **127개** 메뉴를 섹션별로 정리했습니다. 각 메뉴의 설명과 **사용 예시**를 텍스트로 제공합니다.
- **메뉴 검색**: 가이드 목록에서 **메뉴 이름**을 입력하면 실시간으로 필터링됩니다. 입력이 비어 있으면 전체 목록이 표시됩니다.

### 가이드 섹션

기본 메뉴 · 디버깅 · 네트워킹 · 입력 · 그림 · 하드웨어 가속 렌더링 · 미디어 · 모니터링 · 앱 · 오토필 · 저장용량 · 위치 · 보안 · 입력 방식 · 기타

> 메뉴 이름과 위치는 기기·제조사·안드로이드 버전에 따라 다를 수 있습니다.

## 권한 안내 (간편 켜기/끄기만 해당)

**설정 화면 열기**와 **메뉴 설명 가이드**는 추가 권한이 필요 없습니다.

앱에서 **스위치로 켜고 끄려면** `WRITE_SECURE_SETTINGS` 권한이 필요합니다.  
일반 앱은 이 권한을 설치 시 부여받지 않으므로, **PC에서 ADB로 한 번 부여**해 주어야 합니다.

### ADB로 권한 부여 (최초 1회)

1. PC에 [Android Platform Tools](https://developer.android.com/studio/releases/platform-tools) 설치
2. 기기에서 **USB 디버깅** 활성화 후 PC와 USB 연결
3. 터미널(또는 명령 프롬프트)에서 실행:

```bash
adb shell pm grant com.devoptionshelper android.permission.WRITE_SECURE_SETTINGS
```

권한을 부여한 후에는 앱 내 스위치로 개발자 옵션을 켜고 끌 수 있습니다.

## 빌드 방법

- **Android Studio**: `DevOptionsHelper` 폴더를 **Open an existing project**로 열고 Run.
- **명령줄**: 프로젝트 루트에서  
  `./gradlew assembleDebug` (Mac/Linux) 또는  
  `gradlew.bat assembleDebug` (Windows)

릴리스 빌드: `gradlew.bat assembleRelease` (Windows)

## 환경

- minSdk 24 · targetSdk 35 · compileSdk 35
- Kotlin + View Binding
- Material Components
