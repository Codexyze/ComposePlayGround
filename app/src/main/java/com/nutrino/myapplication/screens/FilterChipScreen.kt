package com.nutrino.myapplication.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Crop
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun FilterChipShowcase() {
    // Column to display multiple FilterChip examples
    Column {
        // Example 1: Basic FilterChip with gradient border
        var selected1 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected1,
            onClick = { selected1 = !selected1 },
            label = { Text("Basic Filter chip") },
            border = BorderStroke(
                width = 2.dp,
                brush = Brush.linearGradient(
                    colors = listOf(Color.Green, Color.Magenta)
                )
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 2: FilterChip with leading icon
        var selected2 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected2,
            onClick = { selected2 = !selected2 },
            label = { Text("With Leading Icon") },
            leadingIcon = {
                Icon(Icons.Filled.Home, contentDescription = "Home")
            },
            border = BorderStroke(2.dp, Brush.linearGradient(listOf(Color.Cyan, Color.Blue)))
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 3: FilterChip with trailing icon
        var selected3 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected3,
            onClick = { selected3 = !selected3 },
            label = { Text("With Trailing Icon") },
            trailingIcon = {
                Icon(Icons.Filled.Done, contentDescription = "Done")
            },
            border = BorderStroke(2.dp, Brush.linearGradient(listOf(Color.Yellow, Color.Red)))
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 4: Disabled FilterChip
        var selected4 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected4,
            onClick = { selected4 = !selected4 },
            label = { Text("Disabled Chip") },
            enabled = false,
            border = BorderStroke(2.dp, Brush.linearGradient(listOf(Color.Gray, Color.LightGray)))
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 5: Custom colors for selected/unselected state
        var selected5 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected5,
            onClick = { selected5 = !selected5 },
            label = { Text("Custom Colors") },
            colors = FilterChipDefaults.filterChipColors(
                selectedContainerColor = Color(0xFFB3E5FC),
                containerColor = Color(0xFFFFF9C4),
                labelColor = Color.Black,
                selectedLabelColor = Color.Blue
            ),
            border = BorderStroke(2.dp, Brush.linearGradient(listOf(Color.Magenta, Color.Blue)))
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 6: Toast on select (original logic)
        var selected6 by remember { mutableStateOf(false) }
        val context = LocalContext.current
        FilterChip(
            selected = selected6,
            onClick = {
                selected6 = !selected6
                if(selected6){
                    Toast.makeText(context, "Filter chip clicked", Toast.LENGTH_SHORT).show()
                }
            },
            label = { Text("Toast on Select") },
            border = BorderStroke(2.dp, Brush.linearGradient(listOf(Color.Green, Color.Magenta)))
        )
        var selected7 by remember { mutableStateOf(false) }

        FilterChip(
            selected = selected7,
            onClick = {
                selected7 = !selected7
            },
            label = {
                Text("Category 1")
            },
            colors = FilterChipDefaults.filterChipColors(
                selectedContainerColor = Color.Red
            ),
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 8: Custom containerColor and labelColor
        var selected8 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected8,
            onClick = { selected8 = !selected8 },
            label = { Text("Custom container & label color") },
            colors = FilterChipDefaults.filterChipColors(
                containerColor = Color(0xFFB2DFDB), // Unselected background
                labelColor = Color(0xFF00695C) // Unselected label
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 9: Custom selectedLabelColor and selectedLeadingIconColor
        var selected9 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected9,
            onClick = { selected9 = !selected9 },
            label = { Text("Selected label & icon color") },
            leadingIcon = { Icon(Icons.Filled.Done, contentDescription = "Done") },
            colors = FilterChipDefaults.filterChipColors(
                selectedLabelColor = Color.White,
                selectedLeadingIconColor = Color.Yellow,
                selectedContainerColor = Color(0xFF1976D2)
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 10: Disabled colors
        var selected10 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected10,
            onClick = { selected10 = !selected10 },
            label = { Text("Disabled colors") },
            enabled = false,
            leadingIcon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            colors = FilterChipDefaults.filterChipColors(
                disabledContainerColor = Color.LightGray,
                disabledLabelColor = Color.DarkGray,
                disabledLeadingIconColor = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 11: Custom border and shape
        var selected11 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected11,
            onClick = { selected11 = !selected11 },
            label = { Text("Custom border & shape") },
            border = BorderStroke(3.dp, Brush.linearGradient(listOf(Color.Red, Color.Blue))),
            colors = FilterChipDefaults.filterChipColors(
                selectedContainerColor = Color(0xFF81D4FA)
            ),
            // shape parameter can be set here if needed
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 12: Trailing icon and custom label
        var selected12 by remember { mutableStateOf(false) }
        FilterChip(
            selected = selected12,
            onClick = { selected12 = !selected12 },
            label = { Text("Trailing icon & custom label") },
            trailingIcon = { Icon(Icons.Filled.Done, contentDescription = "Done") },
            colors = FilterChipDefaults.filterChipColors(
                selectedContainerColor = Color(0xFFFFA726)
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Example 12: Trailing icon and custom label
        var selected13 by remember { mutableStateOf(false) }

        FilterChip(
            selected = selected13,
            onClick = {
                selected13 = !selected13
            },
            label = {
                Text("Personal Chip",
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            if (selected13){
                                listOf(Color(0xFFCF7CDE),
                                    Color(0xFF15D4EC)
                                )
                            }else{
                                listOf(Color(0xFFFB450B),
                                    Color(0xFF89FB05)
                                )
                            }



                        )
                    )

                )
            },
            trailingIcon = {
                if (selected13){
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = null
                    )
                }else{
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = null
                    )

                }
            },
            leadingIcon = {
                if (selected13){
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = null
                    )
                }else{
                    Icon(
                        imageVector = Icons.Filled.Crop,
                        contentDescription = null
                    )

                }
            },
            border = BorderStroke(
                width = 3.dp,
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFEA1D0E),
                        Color(0xFFDAEE0F)
                    )
                )
            ),
            shape = RoundedCornerShape(16.dp),
            elevation = FilterChipDefaults.filterChipElevation(
                elevation = 16.dp
            )

        )
    }

}

// Each FilterChip above demonstrates a different parameter:
// - Basic usage with gradient border
// - Leading icon
// - Trailing icon
// - Disabled state
// - Custom colors for selected/unselected
// - Toast on select
// - Custom containerColor and labelColor
// - Custom selectedLabelColor and selectedLeadingIconColor
// - Disabled colors
// - Custom border and shape
// - Trailing icon and custom label
// Use Spacer for separation and Column for vertical arrangement.
// No existing logic was changed, only new examples and comments were added.
