package com.nutrino.myapplication.navigation.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nutrino.myapplication.navigation.routes.ALERT_DILAGOUE_SCREEN
import com.nutrino.myapplication.navigation.routes.BACKGROUND_GRADIENT_COLUMN_SCREEN
import com.nutrino.myapplication.navigation.routes.BUTTON_SCREEN
import com.nutrino.myapplication.navigation.routes.CARD_SCREEN
import com.nutrino.myapplication.navigation.routes.CHECK_BOX_SCREEN
import com.nutrino.myapplication.navigation.routes.COLUMN_LAYOUT_SCREEN
import com.nutrino.myapplication.navigation.routes.FILTER_SHOWCASE_SCREEN
import com.nutrino.myapplication.navigation.routes.ICONS_BUTTON
import com.nutrino.myapplication.navigation.routes.IMAGE_SCREEN
import com.nutrino.myapplication.navigation.routes.LAZY_COLUMN_EXAMPLE_SCREEN
import com.nutrino.myapplication.navigation.routes.LIST_OF_ALL_OPTIONS
import com.nutrino.myapplication.navigation.routes.OUTLINED_TEXT_FILED_SCREEN
import com.nutrino.myapplication.navigation.routes.RADIO_BUTTON_SCREEN
import com.nutrino.myapplication.navigation.routes.ROW_LAYOUT_SCREEN
import com.nutrino.myapplication.navigation.routes.SCAFFOLD_DRAWER_SCREEN
import com.nutrino.myapplication.navigation.routes.SCAFFOLD_SCREEN
import com.nutrino.myapplication.navigation.routes.SCROLLABLE_COLUMN_ARND_ROW_SCREEN
import com.nutrino.myapplication.navigation.routes.SWITCH_BUTTON_SCREEN
import com.nutrino.myapplication.navigation.routes.TEXT_SHOW_CASE_SCREEN
import com.nutrino.myapplication.navigation.routes.TOAST_SCREEN
import com.nutrino.myapplication.screens.AlertDilogueScreen
import com.nutrino.myapplication.screens.BackgroundGradientColumn
import com.nutrino.myapplication.screens.ButtonShowcaseScreen
import com.nutrino.myapplication.screens.CardScreen
import com.nutrino.myapplication.screens.CheckBoxScreen
import com.nutrino.myapplication.screens.ColumnLayoutScreen
import com.nutrino.myapplication.screens.FilterChipShowcase
import com.nutrino.myapplication.screens.IconsScreen
import com.nutrino.myapplication.screens.ImageScreen
import com.nutrino.myapplication.screens.LazyColumnExample
import com.nutrino.myapplication.screens.ListOfAllOptionsScreen
import com.nutrino.myapplication.screens.OutLinedTextFieldScreen
import com.nutrino.myapplication.screens.RadioButtonScreen
import com.nutrino.myapplication.screens.RowLayoutScreen
import com.nutrino.myapplication.screens.ScaffoldDemoApp
import com.nutrino.myapplication.screens.ScaffoldDrawerScreen
import com.nutrino.myapplication.screens.ScrollableColumnAndRowScreen
import com.nutrino.myapplication.screens.SwitchButtonScreen
import com.nutrino.myapplication.screens.TextShowcaseScreen
import com.nutrino.myapplication.screens.ToastScreen

@Composable
fun MainApp() {

    val navcontroller = rememberNavController()

    NavHost(navController = navcontroller, startDestination = LIST_OF_ALL_OPTIONS){
        composable<LIST_OF_ALL_OPTIONS> {
            ListOfAllOptionsScreen(navController = navcontroller)
        }
        composable <COLUMN_LAYOUT_SCREEN>{
            ColumnLayoutScreen()
        }
        composable<ROW_LAYOUT_SCREEN> {
            RowLayoutScreen()
        }
        composable<SCROLLABLE_COLUMN_ARND_ROW_SCREEN> {
            ScrollableColumnAndRowScreen()
        }
        composable<TEXT_SHOW_CASE_SCREEN> {
            TextShowcaseScreen()
        }
        composable<SCAFFOLD_SCREEN> {
            ScaffoldDemoApp()
        }
        composable<SCAFFOLD_DRAWER_SCREEN> {
            ScaffoldDrawerScreen()
        }
        composable<LAZY_COLUMN_EXAMPLE_SCREEN> {
            LazyColumnExample()
        }
        composable<BACKGROUND_GRADIENT_COLUMN_SCREEN> {
            BackgroundGradientColumn()
        }
        composable<OUTLINED_TEXT_FILED_SCREEN> {
            OutLinedTextFieldScreen()
        }
        composable<CHECK_BOX_SCREEN> {
            CheckBoxScreen()
        }
        composable<SWITCH_BUTTON_SCREEN>{
            SwitchButtonScreen()
        }
        composable<TOAST_SCREEN>{
            ToastScreen()
        }
        composable<ICONS_BUTTON> {
            IconsScreen()
        }

        composable<CARD_SCREEN> {
            CardScreen()
        }
        composable<ALERT_DILAGOUE_SCREEN> {
            AlertDilogueScreen()
        }
        composable<BUTTON_SCREEN> {
            ButtonShowcaseScreen()
        }
        composable<IMAGE_SCREEN> {
            ImageScreen()
        }
        composable<FILTER_SHOWCASE_SCREEN> {
            FilterChipShowcase()
        }
        composable<RADIO_BUTTON_SCREEN> {
            RadioButtonScreen()
        }

    }

}
