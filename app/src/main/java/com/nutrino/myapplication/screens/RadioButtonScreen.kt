package com.nutrino.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonScreen() {
    // Scroll state to make entire screen scrollable when content is long
    val scrollState = rememberScrollState()

    // Simple boolean for single radio button example
    var singleSelected by rememberSaveable { mutableStateOf(true) }

    // State for radio group example (only one option selected at a time)
    val options = listOf("Option A", "Option B", "Option C")
    var selectedOption by rememberSaveable { mutableStateOf(options[0]) }

    // State for custom colors example
    var customSelected by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize() // Take full available height and width
            .verticalScroll(scrollState) // Enable vertical scrolling
            .padding(16.dp) // Outer padding for spacing from screen edges
    ) {
        // Example 1: Basic single RadioButton that can be toggled on/off
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = singleSelected,
                onClick = {
                    // Toggle state when user taps on the radio button
                    singleSelected = !singleSelected
                }
            )
            Text(
                text = "Single RadioButton example",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        HorizontalDivider()

        // Example 2: Classic radio group where only one option is selected at a time
        Text(
            text = "Radio group example (choose one)",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 8.dp)
        )

        // Loop through options and create one row per option
        options.forEach { option ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (option == selectedOption),
                    onClick = {
                        // When one is selected, update the single selected value
                        selectedOption = option
                    }
                )
                Text(
                    text = option,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }

        HorizontalDivider()

        // Example 3: RadioButton with custom colors using RadioButtonDefaults.colors
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = customSelected,
                onClick = {
                    customSelected = !customSelected
                },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color(0xFFAB47BC), // Color when checked
                    unselectedColor = Color.Gray, // Color when not checked
                    disabledSelectedColor = Color.LightGray,
                    disabledUnselectedColor = Color.LightGray
                )
            )
            Text(
                text = "Custom color RadioButton",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        HorizontalDivider()

        // Example 4: Enabled vs disabled RadioButtons
        Text(
            text = "Enabled and disabled state",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = true,
                onClick = { /* Normally update state, kept static for demo */ },
                enabled = true
            )
            Text(
                text = "Enabled RadioButton",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = false,
                onClick = { /* Disabled, so click will do nothing */ },
                enabled = false
            )
            Text(
                text = "Disabled RadioButton",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewRadioButtonScreen() {
    // Preview for quickly checking layout in Android Studio
    RadioButtonScreen()
}

