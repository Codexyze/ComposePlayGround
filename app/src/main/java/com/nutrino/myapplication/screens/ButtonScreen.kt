package com.nutrino.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun ButtonShowcaseScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp).verticalScroll(state = scrollState),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "🚀 Button Mastery in Compose",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        // -------------------------------------------------------------------
        // 1️⃣ BASIC BUTTON
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Basic Button")
        }

        // -------------------------------------------------------------------
        //  ENABLED / DISABLED BUTTON
        // -------------------------------------------------------------------
        val isEnabled = remember { mutableStateOf(true) }

        Button(
            onClick = { isEnabled.value = !isEnabled.value },
            modifier = Modifier.fillMaxWidth(),
            enabled = isEnabled.value  // enables / disables the button
        ) {
            Text(if (isEnabled.value) "Tap to Disable" else "Disabled State")
        }

        // -------------------------------------------------------------------
        // 3️⃣ CUSTOM COLORS
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1976D2),   // Background
                contentColor = Color.White           // Text & Icon color
            )
        ) {
            Text("Custom Color Button")
        }

        // -------------------------------------------------------------------
        // 4️⃣ CUSTOM SHAPE
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp) // more rounded shape
        ) {
            Text("Rounded Corner Button (24.dp)")
        }

        // -------------------------------------------------------------------
        // 5️⃣ BUTTON WITH ICON
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(Icons.Default.Send, contentDescription = null)
            Spacer(Modifier.width(8.dp))
            Text("Button With Icon")
        }

        // -------------------------------------------------------------------
        // 6️⃣ ICON-ONLY ROUND BUTTON
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            shape = CircleShape,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE91E63))
        ) {
            Icon(Icons.Default.Favorite, contentDescription = null, tint = Color.White)
        }

        // -------------------------------------------------------------------
        // 7️⃣ CUSTOM ELEVATION
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 6.dp,
                pressedElevation = 10.dp,
                focusedElevation = 8.dp
            )
        ) {
            Text("Custom Elevation Button")
        }

        // -------------------------------------------------------------------
        // 8️⃣ CUSTOM BORDER (Outlined Button)
        // -------------------------------------------------------------------
        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(width = 5.dp, brush = Brush.linearGradient(
                colors = listOf(
                    Color.Magenta,
                    Color.Cyan
                )

            ))
        ) {
            Text("Border Stroke Button")
        }

        // -------------------------------------------------------------------
        // 9️⃣ CUSTOM CONTENT PADDING
        // -------------------------------------------------------------------
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(
                horizontal = 32.dp,
                vertical = 20.dp
            )
        ) {
            Text("Extra Padded Button")
        }

        // -------------------------------------------------------------------
        // 🔟 INTERACTION SOURCE
        // Useful for detecting press/hover states
        // -------------------------------------------------------------------
        val interactionSource = remember { MutableInteractionSource() }

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            interactionSource = interactionSource
        ) {
            Text("Interaction Source Button")
        }

        // -------------------------------------------------------------------
        // 1️⃣1️⃣ GRADIENT BACKGROUND BUTTON (via Box)
        // -------------------------------------------------------------------
        val gradient = Brush.horizontalGradient(
            listOf(Color(0xFFAB47BC), Color(0xFF42A5F5))
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(gradient, RoundedCornerShape(16.dp))
        ) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                ),
                elevation = null
            ) {
                Text("Gradient Background Button")
            }
        }

        // -------------------------------------------------------------------
        // 1️⃣2️⃣ GRADIENT BORDER OUTLINED BUTTON
        // -------------------------------------------------------------------
        val borderGradient = Brush.linearGradient(
            listOf(Color(0xFFFF5722), Color(0xFFFFC107))
        )

        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(2.dp, borderGradient),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.White,
                containerColor = Color.Transparent
            )
        ) {
            Text("Gradient Border Button")
        }

        // -------------------------------------------------------------------
        // 1️⃣3️⃣ TONAL BUTTON
        // -------------------------------------------------------------------
        FilledTonalButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Tonal Button")
        }

        // -------------------------------------------------------------------
        // 1️⃣4️⃣ ELEVATED BUTTON
        // -------------------------------------------------------------------
        ElevatedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Elevated Button")
        }

        IconButton(
            onClick = {

            }
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = null,
                tint = Color.Red,
                modifier = Modifier.size(100.dp)
                    .align(Alignment.CenterHorizontally
                    ))
        }
        ButtonDemo()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtons() { ButtonShowcaseScreen() }
