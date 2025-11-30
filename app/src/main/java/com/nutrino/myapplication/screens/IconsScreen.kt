package com.nutrino.myapplication.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nutrino.myapplication.R

@Composable
fun IconsScreen() {
    // Column arranges icons vertically and fills the screen
    Column(
        modifier = Modifier.fillMaxSize().padding(end = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ========== Icon with imageVector (default Material icon) ==========
        Icon(
            imageVector = Icons.Filled.Favorite, // Built-in Material icon
            contentDescription = "Favorite icon", // Accessibility description
            tint = Color.Red // Tint color for the icon
        )
        Spacer(modifier = Modifier.size(16.dp))

        // ========== Icon with custom size ==========
        Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = "Home icon",
            modifier = Modifier.size(48.dp), // Custom icon size
            tint = Color.Blue
        )
        Spacer(modifier = Modifier.size(16.dp))

        // ========== Icon with default tint (uses current theme color) ==========
        Icon(
            imageVector = Icons.Filled.Settings,
            contentDescription = "Settings icon"
            // No tint specified, uses default
        )
        Spacer(modifier = Modifier.size(16.dp))

        // ========== Icon using painterResource (for custom drawable) ==========
        // Replace R.drawable.ic_launcher_foreground with your own drawable if needed
        Icon(
            painter = painterResource(id = android.R.drawable.ic_dialog_info),
            contentDescription = "Info icon",
            tint = Color.Green,
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.size(16.dp))

        // ========== Icon with no contentDescription (not recommended for accessibility) ==========
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = null, // No accessibility description
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.size(16.dp))

        // ========== Icon with custom modifier (size and padding) ==========
        Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = "Home icon with custom modifier",
            modifier = Modifier.size(40.dp),
            tint = Color.Magenta
        )
        Spacer(modifier = Modifier.size(16.dp))

        //====My Custom Icons added in drawable ======/
        Icon(
            painter = painterResource(R.drawable.home),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
    }
}