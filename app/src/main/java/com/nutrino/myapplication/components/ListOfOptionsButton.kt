package com.nutrino.myapplication.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListOfOptionsButton(text: String, onclick:()->Unit) {
    Button(
        onClick = {
            onclick()

        },
        modifier = Modifier.fillMaxWidth(0.85f)
    ) {
        Text("$text")
    }

}