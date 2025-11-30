// Import necessary Compose libraries for UI components and modifiers
package com.nutrino.myapplication.screens

import androidx.compose.foundation.background // For setting background color
import androidx.compose.foundation.layout.Box // Box layout
import androidx.compose.foundation.layout.Row // Row layout
import androidx.compose.foundation.layout.Spacer // Spacer for spacing
import androidx.compose.foundation.layout.fillMaxWidth // Modifier to fill max width
import androidx.compose.foundation.layout.height // Modifier to set height
import androidx.compose.foundation.layout.width // Modifier to set width
import androidx.compose.material3.Text // Text composable
import androidx.compose.runtime.Composable // Composable annotation
import androidx.compose.ui.Alignment // Alignment options
import androidx.compose.ui.Modifier // Modifier for UI changes
import androidx.compose.ui.graphics.Color // Color class
import androidx.compose.ui.unit.dp // For dp units

// Main composable function for the screen
@Composable
fun RowLayoutScreen() {
    // Create a horizontal row that fills the width of the screen
    Row(modifier = Modifier.fillMaxWidth()) {
        // Loop to create 6 boxes with spacing between them
        for (i in 1..6){
            CustomBox(
                text = "Text $i" // Display a custom box with label
            )
            Spacer(modifier = Modifier.width(20.dp)) // Add horizontal space between boxes
        }
    }

}

// Composable function to display a colored box with centered text
@Composable
private fun CustomBox(text: String) {
    Box(
        modifier = Modifier
            .background(
                color = Color.Blue // Set background color to blue
            )
            .height(80.dp) // Set box height to 80dp
            .width(80.dp), // Set box width to 80dp
        contentAlignment = Alignment.Center // Center content inside the box

    ){
        Text(text) // Display the provided text inside the box

    }

}