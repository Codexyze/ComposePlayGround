package com.nutrino.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SwitchButtonScreen() {
    // State to keep track of whether the switch is checked or not, survives configuration changes
    val checkedState = rememberSaveable { mutableStateOf(false) }
    // Main vertical layout that fills the entire screen
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Horizontal layout for label and switch, fills the width and centers vertically
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Text label for the switch
            Text("Enable Feature")
            // Spacer to add space between the label and the switch
            Spacer(modifier = Modifier.width(80.dp))
            // Switch component, toggles checkedState when clicked
            Switch(
                checked = checkedState.value,
                onCheckedChange = {
                    checkedState.value = it
                }
            )
        }
    }

}

@Preview
@Composable
private fun prevCheckSwitchButtonScreen() {
    // Spacer to add vertical space before the preview
    Spacer(modifier = Modifier.height(50.dp))
    // Preview of the SwitchButtonScreen composable
    SwitchButtonScreen()
}