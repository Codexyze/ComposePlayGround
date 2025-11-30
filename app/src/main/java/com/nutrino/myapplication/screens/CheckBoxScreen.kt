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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment // Align checkbox and text vertically in each row
import androidx.compose.material3.HorizontalDivider // Thin line to separate rows for readability
import androidx.compose.ui.graphics.Color

@Composable
fun CheckBoxScreen() {

    // rememberScrollState() keeps track of current scroll position
    val scrollState = rememberScrollState()
    val checkBoxState = rememberSaveable { mutableStateOf(false) }
    // Additional states for three more checkboxes
    val checkBoxState2 = rememberSaveable { mutableStateOf(false) }
    val checkBoxState3 = rememberSaveable { mutableStateOf(false) }
    val checkBoxState4 = rememberSaveable { mutableStateOf(false) }

    // Column to arrange text elements vertically
    Column(
        modifier = Modifier
            .fillMaxSize() // Fill available screen space
            .verticalScroll(scrollState) // Make it scrollable vertically
            .padding(16.dp) // Outer padding for breathing space
    ) {
        // Row 1: Center-align contents vertically so text lines up with the checkbox
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkBoxState.value,
                onCheckedChange = { checkBoxState.value = it },
                colors = CheckboxColors(
                    checkedBorderColor = Color.Red,
                    uncheckedBorderColor = Color.Red,
                    uncheckedBoxColor = Color.Red,
                    disabledBorderColor = Color.Red,
                    checkedBoxColor = Color.Red,
                    disabledCheckedBoxColor = Color.Red,
                    disabledIndeterminateBorderColor = Color.Red,
                    checkedCheckmarkColor = Color.Red,
                    disabledIndeterminateBoxColor = Color.Red,
                    disabledUncheckedBorderColor = Color.Red,
                    uncheckedCheckmarkColor = Color.Red,
                    disabledUncheckedBoxColor =Color.Red
                )
            )
            Text(
                "Choosing to opt in to something",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        HorizontalDivider()

        // Row 2
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkBoxState2.value,
                onCheckedChange = { checkBoxState2.value = it }
            )
            Text(
                "Receive email updates",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        HorizontalDivider()

        // Row 3
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkBoxState3.value,
                onCheckedChange = { checkBoxState3.value = it }
            )
            Text(
                "Enable push notifications",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        HorizontalDivider()

        // Row 4
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkBoxState4.value,
                onCheckedChange = { checkBoxState4.value = it }
            )
            Text(
                "Share anonymous usage data",
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prevCheckBoxScreen() {
    Spacer(modifier = Modifier.height(80.dp))
    CheckBoxScreen()
}