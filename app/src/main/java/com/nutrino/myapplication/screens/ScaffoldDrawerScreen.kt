package com.nutrino.myapplication.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDrawerScreen() {
    // Drawer state for controlling open/close of navigation drawer
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    // Coroutine scope for launching drawer open/close actions
    val scope = rememberCoroutineScope()

    // ModalNavigationDrawer wraps the whole screen and provides drawer functionality
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            // Drawer sheet content: add navigation items here
            ModalDrawerSheet {
                // First navigation item
                NavigationDrawerItem(
                    label = { Text("Home") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } }
                )
                // Divider between items
                HorizontalDivider()
                // Second navigation item
                NavigationDrawerItem(
                    label = { Text("Settings") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } }
                )
            }
        }
    ) {
        // Scaffold provides top bar, bottom bar, and main content
        Scaffold(
            topBar = {
                // TopAppBar with title and hamburger menu icon to open drawer
                TopAppBar(
                    title = { Text("Scaffold Example") },
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Open Drawer")
                        }
                    }
                )
            },
            bottomBar = {
                // Optional bottom bar for additional actions
                BottomAppBar {
                    Text("Bottom Bar")
                }
            },
            content = { innerPadding ->
                // Main content area, padded to avoid overlap with app bars
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    // Replace with your actual screen content
                    Text("My content")
                }
            }
        )
    }
}