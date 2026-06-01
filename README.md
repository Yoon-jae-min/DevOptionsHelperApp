# 개발자 옵션 도우미 (DevOptionsHelper)

개발자 옵션 설정 화면으로 바로 이동하고, 원하면 앱 안에서 간편하게 켜고 끌 수 있는 Android 앱입니다.

## 기능

- **설정 화면 열기 (기본)**: 권한 없이 시스템 개발자 옵션(또는 설정) 화면으로 바로 이동합니다. 플레이 스토어에서 받은 사용자도 바로 사용할 수 있습니다.
- **간편 켜기/끄기 (선택)**: PC에서 ADB로 권한을 한 번 부여한 경우, 앱 내 스위치로 개발자 옵션을 켜거나 끕니다.

## 권한 안내 (간편 켜기/끄기만 해당)

**설정 화면 열기**는 추가 권한이 필요 없습니다.

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

## 환경

- minSdk 24  
- Kotlin + View Binding  
- Material Components
