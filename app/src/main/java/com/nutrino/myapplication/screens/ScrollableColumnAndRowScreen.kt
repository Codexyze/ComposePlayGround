// This file demonstrates a screen with a horizontally scrollable Row at the top and a vertically scrollable Column below it.
// Each box in the Row and Column is colored blue and displays its index.
// The layout ensures the Row is always visible at the top, and the Column takes up the remaining space.

package com.nutrino.myapplication.screens

import androidx.compose.foundation.background // For setting background color
import androidx.compose.foundation.horizontalScroll // For horizontal scrolling
import androidx.compose.foundation.layout.Box // Box layout
import androidx.compose.foundation.layout.Column // Column layout
import androidx.compose.foundation.layout.Row // Row layout
import androidx.compose.foundation.layout.Spacer // Spacer for spacing
import androidx.compose.foundation.layout.fillMaxSize // Modifier to fill max size
import androidx.compose.foundation.layout.fillMaxWidth // Modifier to fill max width
import androidx.compose.foundation.layout.height // Modifier to set height
import androidx.compose.foundation.layout.width // Modifier to set width
import androidx.compose.foundation.rememberScrollState // For scroll state
import androidx.compose.foundation.verticalScroll // For vertical scrolling
import androidx.compose.material3.Text // Text composable
import androidx.compose.runtime.Composable // Composable annotation
import androidx.compose.ui.Alignment // Alignment options
import androidx.compose.ui.Modifier // Modifier for UI changes
import androidx.compose.ui.graphics.Color // Color class
import androidx.compose.ui.unit.dp // For dp units

// Main screen composable: displays a horizontally scrollable row at the top and a vertically scrollable column below
@Composable
fun ScrollableColumnAndRowScreen() {
    Column(
        modifier = Modifier.fillMaxSize() // Fill the entire screen
    ){
        // Row at the top, full width, fixed height, horizontally scrollable
        ScrollableRowLayoutScreen(
            modifier = Modifier
                .fillMaxWidth() // Row spans full width
                .height(80.dp) // Fixed height for Row
        )
        // Spacer for separation between Row and Column
        Spacer(modifier = Modifier.height(20.dp))
        // Column below, takes remaining space and is vertically scrollable
        ScrollableColumnLayoutScreen(
            modifier = Modifier
                .weight(1f) // Takes up remaining vertical space
                .fillMaxWidth() // Column spans full width
        )
    }
}

// Vertically scrollable column composable
// Displays a list of blue boxes with text labels, centered horizontally
@Composable
private fun ScrollableColumnLayoutScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState() // State for vertical scrolling
    Column(
        modifier = modifier.verticalScroll(scrollState), // Make column scrollable
        horizontalAlignment = Alignment.CenterHorizontally // Center children horizontally
    ) {
        // Display 60 blue boxes with spacing
        for (i in 1..60){
            CustomBox(text = "Box $i") // Blue box with label
            Spacer(modifier = Modifier.height(28.dp)) // Space between boxes
        }
    }
}

// Displays a single blue box with centered text, used in the column
@Composable
private fun CustomBox(text: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.85f) // Box fills 85% of the width
            .background(
                color = Color.Blue // Set background color to blue
            )
            .height(80.dp), // Set box height to 80dp
        contentAlignment = Alignment.Center // Center content inside the box
    ){
        Text(text) // Display the provided text inside the box
    }
}

// Horizontally scrollable row composable
// Displays a list of blue boxes with text labels, aligned vertically center
@Composable
fun ScrollableRowLayoutScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState() // State for horizontal scrolling
    Row(modifier = modifier.horizontalScroll(scrollState)) {
        // Display 60 blue boxes with spacing
        for (i in 1..60){
            CustomRowBox(
                text = "Text $i" // Blue box with label
            )
            Spacer(modifier = Modifier.width(20.dp)) // Space between boxes
        }
    }
}

// Displays a single blue box with centered text, used in the row
@Composable
private fun CustomRowBox(text: String) {
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