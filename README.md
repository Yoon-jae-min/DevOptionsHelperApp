# 개발자 옵션 도우미 (DevOptionsHelper)

버튼 하나로 개발자 옵션을 켜고 끌 수 있고, 켜진 경우 개발자 옵션 메뉴를 여는 Android 앱입니다.

## 기능

- **개발자 옵션 켜기/끄기**: 한 번의 탭으로 시스템 개발자 옵션을 켜거나 끕니다.
- **개발자 옵션 메뉴 열기**: 개발자 옵션이 켜져 있을 때, 시스템의 개발자 옵션 설정 화면을 엽니다.

## 권한 안내

개발자 옵션을 **앱에서 켜거나 끄려면** `WRITE_SECURE_SETTINGS` 권한이 필요합니다.  
일반 앱은 이 권한을 설치 시 부여받지 않으므로, **PC에서 ADB로 한 번 부여**해 주어야 합니다.

### ADB로 권한 부여 (최초 1회)

1. PC에 [Android Platform Tools](https://developer.android.com/studio/releases/platform-tools) 설치
2. 기기에서 **USB 디버깅** 활성화 후 PC와 USB 연결
3. 터미널(또는 명령 프롬프트)에서 실행:

```bash
adb shell pm grant com.devoptionshelper android.permission.WRITE_SECURE_SETTINGS
```

권한을 부여한 후에는 앱 내 버튼으로 개발자 옵션을 켜고 끌 수 있습니다.

- **개발자 옵션 메뉴 열기**는 권한 없이 동작합니다 (시스템 설정 화면으로 이동).

## 빌드 방법

- **Android Studio**: `DevOptionsHelper` 폴더를 **Open an existing project**로 열고 Run.
- **명령줄**: 프로젝트 루트에서  
  `./gradlew assembleDebug` (Mac/Linux) 또는  
  `gradlew.bat assembleDebug` (Windows)

## 환경

- minSdk 24  
- Kotlin + View Binding  
- Material Components
