package com.nutrino.myapplication.screens

// ✅ All Imports
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

// 🎯 Main Composable Function
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDemoApp() {
    // Drawer state for controlling navigation drawer
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    // Snackbar host state for showing snackbars
    val snackbarHostState = remember { SnackbarHostState() }
    // Coroutine scope for launching drawer/snackbar actions
    val scope = rememberCoroutineScope()
    // Bottom navigation currently selected item index
    var selectedBottomItem by remember { mutableStateOf(0) }
    // Titles for bottom nav items
    val bottomNavItems = listOf("Home", "Profile", "Settings")

    // Wrap Scaffold inside ModalNavigationDrawer for drawer support
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text("Navigation Drawer", style = MaterialTheme.typography.titleLarge)
                    Spacer(Modifier.height(16.dp))
                    TextButton(onClick = { /* Navigate to Home */ }) { Text("Home") }
                    TextButton(onClick = { /* Navigate to Profile */ }) { Text("Profile") }
                    TextButton(onClick = { /* Navigate to Settings */ }) { Text("Settings") }
                }
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "My Scaffold App") },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch { drawerState.open() }
                        }) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                    },
                    actions = {
                        IconButton(onClick = { /* search action */ }) {
                            Icon(Icons.Default.Search, contentDescription = "Search")
                        }
                        IconButton(onClick = { /* settings action */ }) {
                            Icon(Icons.Default.Settings, contentDescription = "Settings")
                        }
                    }
                )
            },
            floatingActionButton = {
                // ➕ Floating Action Button
                FloatingActionButton(onClick = {
                    scope.launch {
                        // Show snackbar when FAB clicked
                        snackbarHostState.showSnackbar("FAB Clicked!")
                    }
                }) {
                    Icon(Icons.Default.Add, contentDescription = "Add")
                }
            },
            bottomBar = {
                // ⬇️ Bottom Navigation Bar
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, label ->
                        NavigationBarItem(
                            selected = selectedBottomItem == index,
                            onClick = { selectedBottomItem = index },
                            icon = {
                                when (label) {
                                    "Home" -> Icon(Icons.Default.Home, contentDescription = null)
                                    "Profile" -> Icon(Icons.Default.Person, contentDescription = null)
                                    else -> Icon(Icons.Default.Settings, contentDescription = null)
                                }
                            },
                            label = { Text(label) }
                        )
                    }
                }
            },
            snackbarHost = {
                // Snackbar Host to show snack messages
                SnackbarHost(hostState = snackbarHostState)
            },
            content = { paddingValues ->
                // 🧩 Main Screen Content
                Box(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Selected Page: ${bottomNavItems[selectedBottomItem]}",
                        style = MaterialTheme.typography.headlineSmall,
                        color = Color.DarkGray
                    )
                }
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScaffoldDemoAppPreview() {
    ScaffoldDemoApp()
}