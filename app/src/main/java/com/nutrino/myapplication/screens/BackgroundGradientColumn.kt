// This file demonstrates how to create a Column with a linear gradient background using Jetpack Compose
package com.nutrino.myapplication.screens

import androidx.compose.foundation.background // Enables background modifier for composables
import androidx.compose.foundation.layout.Column // Arranges children vertically
import androidx.compose.foundation.layout.fillMaxSize // Modifier to fill the entire parent size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable // Marks composable functions
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier // Used to modify composable appearance/behavior
import androidx.compose.ui.graphics.Brush // Used for gradient backgrounds
import androidx.compose.ui.graphics.Color // Used to specify colors
import androidx.compose.ui.tooling.preview.Preview // For previewing composables in Android Studio

@Composable
fun BackgroundGradientColumn() {
    // Column is a layout composable that arranges its children vertically
    // The modifier fills the entire available size and applies a linear gradient background
    Column(
        modifier = Modifier
            .fillMaxSize() // Makes the Column fill the whole screen
            .background(
                // Applies a linear gradient as the background
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFFAB47BC), // Dark blue color at the top
                        Color(0xFF42A5F5)  // White color at the bottom
                    )
                )
            )
    ) {
        // You can add child composables here, which will be arranged vertically

    }
}

// Preview annotation allows you to see the composable in Android Studio's design view
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BackgroundGradientColumnPreview() {
    // Calls the BackgroundGradientColumn composable for preview
    BackgroundGradientColumn()
}