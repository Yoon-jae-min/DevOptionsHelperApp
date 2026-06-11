param(
    [string]$SourceImage = "$PSScriptRoot\source\samsung_dev_options_scroll.jpg",
    [string]$OutputDir = "$PSScriptRoot\..\app\src\main\res\drawable-nodpi",
    [int]$TargetWidth = 1080,
    [int]$MaxOutputHeight = 2200
)

Add-Type -AssemblyName System.Drawing

if (-not (Test-Path $SourceImage)) {
    Write-Error "Source image not found: $SourceImage"
    exit 1
}

if (-not (Test-Path $OutputDir)) {
    New-Item -ItemType Directory -Path $OutputDir | Out-Null
}

# 삼성 스크롤 캡처 기준 구간 (겹침 최소화)
$sections = @(
    @{ Name = "guide_ss_general";    Start = 0.00; End = 0.085; TopTrimPx = 55 },
    @{ Name = "guide_ss_debugging";  Start = 0.085; End = 0.24 },
    @{ Name = "guide_ss_networking"; Start = 0.24; End = 0.34 },
    @{ Name = "guide_ss_input";      Start = 0.34; End = 0.39 },
    @{ Name = "guide_ss_drawing";    Start = 0.39; End = 0.47 },
    @{ Name = "guide_ss_rendering";  Start = 0.47; End = 0.55 },
    @{ Name = "guide_ss_monitoring"; Start = 0.55; End = 0.61 },
    @{ Name = "guide_ss_apps";       Start = 0.61; End = 0.74 }
)

$bitmap = [System.Drawing.Bitmap]::FromFile((Resolve-Path $SourceImage))
$width = $bitmap.Width
$height = $bitmap.Height
$scale = $TargetWidth / [double]$width

Write-Host "Source: ${width}x${height}"

foreach ($section in $sections) {
    $y = [int]($height * $section.Start)
    if ($section.TopTrimPx) { $y += [int]$section.TopTrimPx }
    $h = [int]($height * ($section.End - $section.Start))
    if ($section.TopTrimPx) { $h -= [int]$section.TopTrimPx }
    if ($h -lt 1) { continue }

    $targetHeight = [int]($h * $scale)
    if ($targetHeight -gt $MaxOutputHeight) {
        # 높이 제한 시 아래를 잘라 비율 유지 (찌부 방지)
        $targetHeight = $MaxOutputHeight
        $h = [int][Math]::Floor($MaxOutputHeight / $scale)
    }
    if ($targetHeight -lt 1) { $targetHeight = 1 }

    $cropRect = New-Object System.Drawing.Rectangle 0, $y, $width, $h
    $cropped = $bitmap.Clone($cropRect, $bitmap.PixelFormat)

    $resized = New-Object System.Drawing.Bitmap $TargetWidth, $targetHeight
    $graphics = [System.Drawing.Graphics]::FromImage($resized)
    $graphics.InterpolationMode = [System.Drawing.Drawing2D.InterpolationMode]::HighQualityBicubic
    $graphics.PixelOffsetMode = [System.Drawing.Drawing2D.PixelOffsetMode]::HighQuality
    $graphics.DrawImage($cropped, 0, 0, $TargetWidth, $targetHeight)
    $graphics.Dispose()

    $outPath = Join-Path $OutputDir ($section.Name + ".png")
    $resized.Save($outPath, [System.Drawing.Imaging.ImageFormat]::Png)

    $cropped.Dispose()
    $resized.Dispose()
    Write-Host "Saved $($section.Name).png (${TargetWidth}x${targetHeight})"
}

$bitmap.Dispose()
Write-Host "Done."
