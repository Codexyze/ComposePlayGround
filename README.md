# ComposePlayGround

Android Jetpack Compose playground is a open source project showcasing multiple UI components with type-safe Navigation Compose destinations, Material 3, and practical UI patterns.

## Versions Used :

![Gradle 8.13](https://img.shields.io/badge/Gradle-8.13-white?logo=gradle&logoColor=02303A&labelColor=02303A&color=555&style=flat-square) ![AGP 8.13.0](https://img.shields.io/badge/Android_Gradle_Plugin-8.13.0-white?logo=android&logoColor=3DDC84&labelColor=1B5E20&color=555&style=flat-square) ![Kotlin 2.2.0](https://img.shields.io/badge/Kotlin-2.2.0-white?logo=kotlin&logoColor=7F52FF&labelColor=1A237E&color=555&style=flat-square) ![Compose BOM 2024.09.00](https://img.shields.io/badge/Compose_BOM-2024.09.00-white?logo=jetpackcompose&logoColor=4285F4&labelColor=0D47A1&color=555&style=flat-square) ![Navigation 2.9.6](https://img.shields.io/badge/Navigation-2.9.6-white?logo=android&logoColor=4285F4&labelColor=0D47A1&color=555&style=flat-square) ![Compile SDK 36](https://img.shields.io/badge/Compile_SDK-36-white?logo=android&logoColor=3DDC84&labelColor=1B5E20&color=555&style=flat-square) ![Target SDK 36](https://img.shields.io/badge/Target_SDK-36-white?logo=android&logoColor=3DDC84&labelColor=1B5E20&color=555&style=flat-square) ![Min SDK 24](https://img.shields.io/badge/Min_SDK-24-white?logo=android&logoColor=3DDC84&labelColor=1B5E20&color=555&style=flat-square) ![Material Icons Ext 1.7.6](https://img.shields.io/badge/Material_Icons_Ext-1.7.6-white?logo=materialdesign&logoColor=000000&labelColor=000000&color=777&style=flat-square) ![kotlinx.serialization 1.8.1](https://img.shields.io/badge/kotlinx.serialization-1.8.1-white?logo=kotlin&logoColor=7F52FF&labelColor=1A237E&color=555&style=flat-square) ![Coil 3.3.0](https://img.shields.io/badge/Coil-3.3.0-white?logo=kotlin&logoColor=000000&labelColor=000000&color=777&style=flat-square) ![FancyToast 2.0.2](https://img.shields.io/badge/FancyToast-2.0.2-white?labelColor=FF6F00&color=777&style=flat-square)


## Repository structure

```
ComposePlayGround/
├─ build.gradle.kts
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
├─ local.properties
├─ settings.gradle.kts
├─ gradle/
│  ├─ libs.versions.toml
│  └─ wrapper/
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
└─ app/
   ├─ build.gradle.kts
   ├─ proguard-rules.pro
   ├─ src/
   │  ├─ main/
   │  │  ├─ AndroidManifest.xml
   │  │  ├─ java/
   │  │  │  └─ com/nutrino/myapplication/
   │  │  │     ├─ MainActivity.kt
   │  │  │     ├─ components/
   │  │  │     │  └─ ListOfOptionsButton.kt
   │  │  │     ├─ navigation/
   │  │  │     │  ├─ navHost/
   │  │  │     │  │  └─ MainApp.kt
   │  │  │     │  └─ routes/
   │  │  │     │     └─ NavRoutes.kt
   │  │  │     ├─ screens/
   │  │  │     │  ├─ AlertDialogScreen.kt
   │  │  │     │  ├─ BackgroundGradientColumn.kt
   │  │  │     │  ├─ ButtonDemo.kt
   │  │  │     │  ├─ ButtonScreen.kt
   │  │  │     │  ├─ CardScreen.kt
   │  │  │     │  ├─ CheckBoxScreen.kt
   │  │  │     │  ├─ ColumnLayoutScreen.kt
   │  │  │     │  ├─ FilterChipScreen.kt
   │  │  │     │  ├─ IconsScreen.kt
   │  │  │     │  ├─ ImageScreen.kt
   │  │  │     │  ├─ LazyColumn.kt
   │  │  │     │  ├─ ListOfAllOptionsScreen.kt
   │  │  │     │  ├─ OutLinedTextFieldScreen.kt
   │  │  │     │  ├─ RadioButtonScreen.kt
   │  │  │     │  ├─ RowLayoutScreen.kt
   │  │  │     │  ├─ ScaffoldDrawerScreen.kt
   │  │  │     │  ├─ ScaffoldScreen.kt
   │  │  │     │  ├─ ScrollableColumnAndRowScreen.kt
   │  │  │     │  ├─ SwitchButtonScreen.kt
   │  │  │     │  ├─ TextShowCaseScreen.kt
   │  │  │     │  └─ ToastScreen.kt
   │  │  │     └─ ui/theme/
   │  │  │        ├─ Color.kt
   │  │  │        ├─ Theme.kt
   │  │  │        └─ Type.kt
   │  │  └─ res/
   │  ├─ androidTest/
   │  │  └─ java/
   │  └─ test/
   │     └─ java/
   └─ build/
      ├─ intermediates/
      ├─ outputs/
      └─ tmp/
```

## Technologies and official docs

- Jetpack Compose: https://developer.android.com/jetpack/compose
- Material 3: https://developer.android.com/jetpack/compose/designsystems/material3
- Navigation for Compose: https://developer.android.com/jetpack/compose/navigation
- Kotlin language: https://kotlinlang.org/docs/home.html
- Kotlinx Serialization: https://github.com/Kotlin/kotlinx.serialization
- Coil 3 (Compose): https://coil-kt.github.io/coil/
- Android Gradle Plugin (AGP): https://developer.android.com/build
- Gradle: https://docs.gradle.org/current/userguide/userguide.html
- FancyToast: https://github.com/Shashank02051997/FancyToast-Android

## Typed (type‑safe) navigation used in this app

This project uses Navigation Compose’s typed destinations API (2.8+), allowing `composable<MyRouteObject>` instead of string route IDs.

Routes are declared as serializable singleton objects in `NavRoutes.kt`:

```kotlin
import kotlinx.serialization.Serializable

@Serializable object LIST_OF_ALL_OPTIONS
@Serializable object COLUMN_LAYOUT_SCREEN
@Serializable object ROW_LAYOUT_SCREEN
@Serializable object SCROLLABLE_COLUMN_ARND_ROW_SCREEN
@Serializable object TEXT_SHOW_CASE_SCREEN
@Serializable object SCAFFOLD_SCREEN
@Serializable object SCAFFOLD_DRAWER_SCREEN
@Serializable object LAZY_COLUMN_EXAMPLE_SCREEN
@Serializable object BACKGROUND_GRADIENT_COLUMN_SCREEN
@Serializable object OUTLINED_TEXT_FILED_SCREEN
@Serializable object CHECK_BOX_SCREEN
@Serializable object SWITCH_BUTTON_SCREEN
@Serializable object TOAST_SCREEN
@Serializable object ICONS_BUTTON
@Serializable object CARD_SCREEN
@Serializable object ALERT_DILAGOUE_SCREEN
@Serializable object BUTTON_SCREEN
@Serializable object IMAGE_SCREEN
@Serializable object FILTER_SHOWCASE_SCREEN
@Serializable object RADIO_BUTTON_SCREEN
```

NavHost wiring (see `navigation/navHost/MainApp.kt`):

```kotlin
NavHost(navController = navcontroller, startDestination = LIST_OF_ALL_OPTIONS) {
    composable<LIST_OF_ALL_OPTIONS> { ListOfAllOptionsScreen(navController = navcontroller) }
    composable<COLUMN_LAYOUT_SCREEN> { ColumnLayoutScreen() }
    composable<ROW_LAYOUT_SCREEN> { RowLayoutScreen() }
    composable<SCROLLABLE_COLUMN_ARND_ROW_SCREEN> { ScrollableColumnAndRowScreen() }
    composable<TEXT_SHOW_CASE_SCREEN> { TextShowcaseScreen() }
    composable<SCAFFOLD_SCREEN> { ScaffoldDemoApp() }
    composable<SCAFFOLD_DRAWER_SCREEN> { ScaffoldDrawerScreen() }
    composable<LAZY_COLUMN_EXAMPLE_SCREEN> { LazyColumnExample() }
    composable<BACKGROUND_GRADIENT_COLUMN_SCREEN> { BackgroundGradientColumn() }
    composable<OUTLINED_TEXT_FILED_SCREEN> { OutLinedTextFieldScreen() }
    composable<CHECK_BOX_SCREEN> { CheckBoxScreen() }
    composable<SWITCH_BUTTON_SCREEN> { SwitchButtonScreen() }
    composable<TOAST_SCREEN> { ToastScreen() }
    composable<ICONS_BUTTON> { IconsScreen() }
    composable<CARD_SCREEN> { CardScreen() }
    composable<ALERT_DILAGOUE_SCREEN> { AlertDilogueScreen() }
    composable<BUTTON_SCREEN> { ButtonShowcaseScreen() }
    composable<IMAGE_SCREEN> { ImageScreen() }
    composable<FILTER_SHOWCASE_SCREEN> { FilterChipShowcase() }
    composable<RADIO_BUTTON_SCREEN> { RadioButtonScreen() }
}
```

Key points:
- Destinations are referenced by type, ensuring compile‑time safety and refactor‑friendly navigation.
- `@Serializable` is required for typed destinations (and can be extended to typed arguments).
- Start destination is the object `LIST_OF_ALL_OPTIONS`, matching the app.

## Screens overview

Below are the screens registered in `navigation/navHost/MainApp.kt`, with a brief description of what each demonstrates and notable parameters/components used.

- ListOfAllOptionsScreen
    - Purpose: Launch menu listing all showcase screens.
    - Notables: Buttons list; `navController.navigate(ROUTE_OBJECT)`.

- ColumnLayoutScreen
    - Purpose: Vertical stacking with Column.
    - Notables: `horizontalAlignment`, `verticalArrangement`, `Modifier.fillMaxWidth`, padding.

- RowLayoutScreen
    - Purpose: Horizontal layout with Row.
    - Notables: `verticalAlignment`, `horizontalArrangement`, spacers; full‑width row.

- ScrollableColumnAndRowScreen
    - Purpose: Scrollable content combining Column and Row.
    - Notables: `verticalScroll`, layout nesting, spacing.

- TextShowCaseScreen
    - Purpose: Rich text styles and annotated strings.
    - Notables: `buildAnnotatedString`, `SpanStyle`, optional gradient `TextStyle(brush)`.

- ScaffoldScreen
    - Purpose: Basic Scaffold structure.
    - Notables: top bar/content/snackbar host; `innerPadding`.

- ScaffoldDrawerScreen
    - Purpose: Drawer navigation.
    - Notables: drawer state management, drawer content composition.

- LazyColumnExample
    - Purpose: Efficient lists with `LazyColumn`.
    - Notables: items, separators, item keys.

- BackgroundGradientColumn
    - Purpose: Gradients and strokes.
    - Notables: `Brush.linearGradient/horizontalGradient`, `Modifier.background(brush)`, `BorderStroke(brush)`.

- OutLinedTextFieldScreen
    - Purpose: Outlined text fields in variants.
    - Notables: `OutlinedTextField` parameters, `TextFieldDefaults.outlinedTextFieldColors`, width `fillMaxWidth(0.85f)`.

- CheckBoxScreen
    - Purpose: Checkbox showcase.
    - Notables: `CheckboxDefaults.colors`, state management.

- SwitchButtonScreen
    - Purpose: Toggle/switch showcase.
    - Notables: `SwitchDefaults.colors`, alignment.

- ToastScreen
    - Purpose: FancyToast examples.
    - Notables: toast types, duration, `LocalContext`.

- IconsScreen
    - Purpose: Material icons options.
    - Notables: filled/outlined variants, tint, a11y, sizing.

- CardScreen
    - Purpose: Card parameters and visuals.
    - Notables: border/elevation/shape/colors; gradient strokes/background; width.

- AlertDilogueScreen
    - Purpose: Dialog actions.
    - Notables: confirm/dismiss, `onDismissRequest`.

- ButtonShowcaseScreen
    - Purpose: Button variants and custom styles.
    - Notables: gradients via `Modifier.background(brush)`; strokes via `BorderStroke`; shapes; icons.

- ImageScreen
    - Purpose: Image loading via Coil.
    - Notables: `AsyncImage` model, placeholders, contentScale.

- FilterChipShowcase
    - Purpose: FilterChip parameters.
    - Notables: colors for selected/unselected/disabled; icons.

- RadioButtonScreen
    - Purpose: Radio button groups.
    - Notables: `RadioButtonDefaults.colors`, grouped selection.

## How to add more UI components (the exact pattern used here)

1. Create a Composable in `screens/`.
2. Add a typed route in `NavRoutes.kt`:
   ```kotlin
   @Serializable object YOUR_NEW_SCREEN
   ```
3. Register in `MainApp.kt`:
   ```kotlin
   composable<YOUR_NEW_SCREEN> { YourNewScreen() }
   ```
4. Add a button in `ListOfAllOptionsScreen` to navigate:
   ```kotlin
   navController.navigate(YOUR_NEW_SCREEN)
   ```
5. For arguments, model them with `@Serializable` data classes and use typed arguments.

## FancyToast usage

Dependency: `io.github.shashank02051997:FancyToast:2.0.2`

Example:
```kotlin
FancyToast.makeText(
    context,
    "Hello from FancyToast!",
    FancyToast.LENGTH_SHORT,
    FancyToast.SUCCESS,
    false
).show()
```

## Build and run

- Open the project in Android Studio.
- Sync Gradle.
- Run on an emulator or device.

## Contributing

- Follow the typed navigation pattern in `NavRoutes.kt` and `MainApp.kt`.
- Keep screens self‑contained with clear examples and comments.
- Align dependencies with the Compose BOM and `libs.versions.toml`.
- Prefer Material 3 components and Compose best practices.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
