// ToastScreen.kt - Demonstrates various types of Toast messages in Jetpack Compose
package com.nutrino.myapplication.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.shashank.sony.fancytoastlib.FancyToast

@Composable
fun ToastScreen(modifier: Modifier = Modifier) {
    // Column arranges children vertically, centers them, and adds padding
    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp), // Fill screen and add outer padding
        verticalArrangement = Arrangement.Center, // Center children vertically
        horizontalAlignment = Alignment.CenterHorizontally, // Center children horizontally
    ) {
        // Get the current context for showing Toasts
        val context = LocalContext.current

        // Standard short Toast message
        Button(
            onClick = {
                Toast.makeText(context, "Hello this is a short toast", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Short Toast")
        }

        // Standard long Toast message
        Button(
            onClick = {
                Toast.makeText(context, "Hello this is a long toast", Toast.LENGTH_LONG).show()
            }
        ) {
            Text("Long Toast")
        }

        // FancyToast - default style, long duration
        Button(
            onClick = {
                FancyToast.makeText(
                    context,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.DEFAULT,
                    true
                ).show()
            }
        ) {
            Text("Fancy Toast-1")
        }

        // FancyToast - success style
        Button(
            onClick = {
                FancyToast.makeText(
                    context,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.SUCCESS,
                    true
                ).show()
            }
        ) {
            Text("Fancy Toast-2")
        }

        // FancyToast - error style
        Button(
            onClick = {
                FancyToast.makeText(
                    context,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.ERROR,
                    true
                ).show()
            }
        ) {
            Text("Fancy Toast-3")
        }

        // FancyToast - warning style
        Button(
            onClick = {
                FancyToast.makeText(
                    context,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.WARNING,
                    true
                ).show()
            }
        ) {
            Text("Fancy Toast-4")
        }

        // FancyToast - confusing style
        Button(
            onClick = {
                FancyToast.makeText(
                    context,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.CONFUSING,
                    true
                ).show()
            }
        ) {
            Text("Fancy Toast-5")
        }

        // FancyToast - confusing style, no icon
        Button(
            onClick = {
                FancyToast.makeText(
                    context,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.CONFUSING,
                    false
                ).show()
            }
        ) {
            Text("Fancy Toast-5")
        }

    }
}