// This file demonstrates a simple LazyColumn usage in Jetpack Compose
package com.nutrino.myapplication.screens

import androidx.compose.foundation.background // For background modifier (not used here)
import androidx.compose.foundation.layout.Column // For vertical layout
import androidx.compose.foundation.layout.Spacer // For spacing (not used here)
import androidx.compose.foundation.layout.fillMaxSize // Modifier to fill parent size
import androidx.compose.foundation.lazy.LazyColumn // For efficient vertical scrolling list
import androidx.compose.foundation.lazy.items // For iterating over list items in LazyColumn
import androidx.compose.material3.Text // For displaying text
import androidx.compose.runtime.Composable // Marks composable functions
import androidx.compose.ui.Modifier // Used to modify composable appearance/behavior
import androidx.compose.ui.tooling.preview.Preview // For previewing composables in Android Studio

@Composable
fun LazyColumnExample() {
    // Create a list of 100 items, each item is a string like "Item #0", "Item #1", ...
    val itemsList = List(100) {
        "Item #$it"
    } // Sample list of 100 items

    // Use a Column to arrange children vertically and fill the available screen size
    Column(modifier = Modifier.fillMaxSize()) {
        // LazyColumn is a vertically scrolling list that only composes visible items
        LazyColumn() {
            // 'items' is used to display each element in itemsList
            items(itemsList){element->
                // Display each item as a Text composable
                Text(text = element)
            }
        }


    }

}

// Preview annotation allows you to see the composable in Android Studio's design view
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LazyColumnExamplePreview() {
    // Calls the LazyColumnExample composable for preview
    LazyColumnExample()
}