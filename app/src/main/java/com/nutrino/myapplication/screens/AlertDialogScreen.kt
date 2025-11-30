// AlertDialogScreen.kt - Demonstrates usage of Material3 AlertDialog in Jetpack Compose
package com.nutrino.myapplication.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun AlertDilogueScreen() {
    // Get the current context for showing Toasts
    val context = LocalContext.current
    // State to control visibility of the AlertDialog
    val alertDialogState = remember { mutableStateOf(false) }
    // Main layout: Column fills the screen
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Button to open the AlertDialog
        Button(
            onClick = {
                alertDialogState.value = true
            }
        ) {
            Text("Open Alert Dilogue")
        }
    }
    // Show AlertDialog when state is true
    if(alertDialogState.value){
        AlertDialog(
            // Called when dialog is dismissed (outside click or back press)
            onDismissRequest = {
                alertDialogState.value = false
            },
            // Confirm button (primary action)
            confirmButton = {
                Button(
                    onClick = {
                        Toast.makeText(context, "Confirm...", Toast.LENGTH_SHORT).show()
                        alertDialogState.value = false
                    }
                ) {
                    Text("Confirm")
                }
            },
            // Dismiss button (secondary action)
            dismissButton = {
                Button(
                    onClick = {
                        Toast.makeText(context, "Dismiss...", Toast.LENGTH_SHORT).show()
                        alertDialogState.value = false
                    }
                ) {
                    Text("Dismissed")
                }
            },
            // Title and content of the dialog
            title = {
                Column(
                    modifier = Modifier
                ) {
                    Text("Alert Dilogue") // Dialog title
                    Text("Hello example 1 ") // Dialog content line 1
                    Text("Hello example 1 ") // Dialog content line 2
                }
            },
            // Optional icon for the dialog (currently empty)
            icon = {
                // add anything u want
            },
            // Custom background color for the dialog
            containerColor = Color.Red
        )
    }

}