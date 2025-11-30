package com.nutrino.myapplication.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.nutrino.myapplication.components.ListOfOptionsButton
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
import com.nutrino.myapplication.navigation.routes.OUTLINED_TEXT_FILED_SCREEN
import com.nutrino.myapplication.navigation.routes.RADIO_BUTTON_SCREEN
import com.nutrino.myapplication.navigation.routes.ROW_LAYOUT_SCREEN
import com.nutrino.myapplication.navigation.routes.SCAFFOLD_DRAWER_SCREEN
import com.nutrino.myapplication.navigation.routes.SCAFFOLD_SCREEN
import com.nutrino.myapplication.navigation.routes.SCROLLABLE_COLUMN_ARND_ROW_SCREEN
import com.nutrino.myapplication.navigation.routes.SWITCH_BUTTON_SCREEN
import com.nutrino.myapplication.navigation.routes.TEXT_SHOW_CASE_SCREEN
import com.nutrino.myapplication.navigation.routes.TOAST_SCREEN

@Composable
fun ListOfAllOptionsScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item {
            ListOfOptionsButton(text = "Column Layout", onclick = {
                navController.navigate(COLUMN_LAYOUT_SCREEN)
            })
            ListOfOptionsButton(text = "Row Layout", onclick = {
                navController.navigate(ROW_LAYOUT_SCREEN)
            })
            ListOfOptionsButton(text = "Scrollable Column and Row", onclick = {
                navController.navigate(SCROLLABLE_COLUMN_ARND_ROW_SCREEN)
            })
            ListOfOptionsButton(
                text = "Text Showcase Screen",
                onclick = {
                    navController.navigate(TEXT_SHOW_CASE_SCREEN)
                }
            )
            ListOfOptionsButton(text = "Scaffold Demo", onclick = {
                    navController.navigate(SCAFFOLD_SCREEN)
            })
            ListOfOptionsButton(
                text = "Scaffold with Drawer Demo",
                onclick = {
                    navController.navigate(SCAFFOLD_DRAWER_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Lazy Column Example",
                onclick = {
                    navController.navigate(LAZY_COLUMN_EXAMPLE_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Background Gradient Column",
                onclick = {
                    navController.navigate(BACKGROUND_GRADIENT_COLUMN_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Outlined text fields",
                onclick = {
                    navController.navigate(OUTLINED_TEXT_FILED_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "CheckBoxScreen",
                onclick = {
                    navController.navigate(CHECK_BOX_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Switch Button Screen",
                onclick = {
                    navController.navigate(SWITCH_BUTTON_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Toast Screen",
                onclick = {
                    navController.navigate(TOAST_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Icons Screen",
                onclick = {
                    navController.navigate(ICONS_BUTTON)
                }
            )

            ListOfOptionsButton(
                text = "Cards",
                onclick = {
                    navController.navigate(CARD_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Alert Dilogue",
                onclick = {
                    navController.navigate(ALERT_DILAGOUE_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Button Showcase",
                onclick = {
                    navController.navigate(BUTTON_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Image Showcase",
                onclick = {
                    navController.navigate(IMAGE_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Filter Showcase",
                onclick = {
                    navController.navigate(FILTER_SHOWCASE_SCREEN)
                }
            )

            ListOfOptionsButton(
                text = "Radio Button Showcase",
                onclick = {
                    navController.navigate(RADIO_BUTTON_SCREEN)
                }
            )

        }


    }

}
