package com.nutrino.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardColors
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun CardScreen() {
    // Scrollable column for vertical scrolling
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ====== Card with Elevation ======
        Text("Card with Elevation", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 16.dp)
        ) {
            Text("Elevation: 16.dp", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Background Color ======
        Text("Card with Background Color", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFB3E5FC))
        ) {
            Text("Background: Light Blue", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Content Color ======
        Text("Card with Content Color", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(contentColor = Color(0xFFD32F2F))
        ) {
            Text("Content Color: Red", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Custom Shape ======
        Text("Card with Custom Shape", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text("Shape: Rounded 24.dp", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Border ======
        Text("Card with Border", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(2.dp, Color(0xFF1976D2))
        ) {
            Text("Border: 2.dp Blue", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Custom Modifier ======
        Text("Card with Custom Modifier", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(80.dp)
        ) {
            Text("Width: 70%, Height: 80.dp", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Gradient Background ======
        Text("Card with Gradient Background", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .drawBehind {
                        drawRect(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFF42A5F5), Color(0xFFAB47BC))
                            )
                        )
                    }
            ) {
                Text("Gradient Background", modifier = Modifier.align(Alignment.Center), color = Color.White)
            }
        }

        // ====== Card with Gradient Border (Stroke) ======
        Text("Card with Gradient Border", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(
                4.dp,
                Brush.linearGradient(listOf(Color(0xFF42A5F5), Color(0xFFAB47BC)))
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Gradient Border", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Gradient Background and Border ======
        Text("Card with Gradient Background & Border", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            border = BorderStroke(
                4.dp,
                Brush.linearGradient(listOf(Color(0xFFAB47BC), Color(0xFF42A5F5)))
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .drawBehind {
                        drawRect(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFFAB47BC), Color(0xFF42A5F5))
                            )
                        )
                    }
            ) {
                Text("Gradient BG & Border", modifier = Modifier.align(Alignment.Center), color = Color.White)
            }
        }

        // ====== Card with Custom Shadow/Elevation ======
        Text("Card with Custom Elevation", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 24.dp)
        ) {
            Text("Elevation: 24.dp", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Custom Shape ======
        Text("Card with Custom Shape", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 32.dp, bottomEnd = 32.dp)
        ) {
            Text("Shape: TopStart & BottomEnd Rounded", modifier = Modifier.padding(16.dp))
        }

        // ====== Card with Custom Content Color ======
        Text("Card with Custom Content Color", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(contentColor = Color(0xFF388E3C))
        ) {
            Text("Content Color: Green", modifier = Modifier.padding(16.dp))
        }

        // ====== Card Example: All Major Parameters Explained ======
        Text("Card with All Major Parameters", fontSize = 18.sp, color = Color.Black)
        Card(
            // Modifier sets width and height of the card
            modifier = Modifier.fillMaxWidth(0.90f).height(120.dp),
            // BorderStroke adds a border with gradient colors and thickness
            border = BorderStroke(
                width = 8.dp,
                brush = Brush.linearGradient(listOf(Color(0xFFAB47BC), Color(0xFF42A5F5)))
            ),
            // Shape sets rounded corners for the card
            shape = RoundedCornerShape(24.dp),
            // Elevation adds shadow below the card
            elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
            // CardDefaults.cardColors allows custom background and content colors
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF3E5F5), // Card background color
                contentColor = Color(0xFF1A237E)    // Text/content color
            )
        ) {
            // Box used to draw a gradient background inside the card
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .drawBehind {
                        drawRect(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFF42A5F5), Color(0xFFAB47BC))
                            )
                        )
                    }
                    .padding(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Box with solid color to show contrast
                    Box(
                        modifier = Modifier.size(60.dp).background(Color.Red)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    // Text uses contentColor from CardDefaults.cardColors
                    Text("All parameters: border, shape, elevation, colors, gradient background", color = Color.White)
                }
            }
        }

        // ====== Card: Simple Solid Background Color ======
        Text("Solid Background Color", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFB3E5FC))
        ) {
            Text("This card uses a solid background color.", modifier = Modifier.padding(16.dp))
        }

        // ====== Card: Gradient Background ======
        Text("Gradient Background", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f).height(100.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .drawBehind {
                        drawRect(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFF42A5F5), Color(0xFFAB47BC))
                            )
                        )
                    }
            ) {
                Text("Gradient background using Box", modifier = Modifier.align(Alignment.Center), color = Color.White)
            }
        }

        // ====== Card: Solid Border ======
        Text("Solid Border", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f),
            border = BorderStroke(4.dp, Color(0xFF1976D2)),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("This card has a solid blue border.", modifier = Modifier.padding(16.dp))
        }

        // ====== Card: Gradient Border ======
        Text("Gradient Border", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f),
            border = BorderStroke(6.dp, Brush.linearGradient(listOf(Color(0xFF42A5F5), Color(0xFFAB47BC)))),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text("This card has a gradient border.", modifier = Modifier.padding(16.dp))
        }

        // ====== Card: Gradient Background & Gradient Border ======
        Text("Gradient Background & Border", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f).height(100.dp),
            border = BorderStroke(8.dp, Brush.linearGradient(listOf(Color(0xFFAB47BC), Color(0xFF42A5F5)))),
            shape = RoundedCornerShape(32.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .drawBehind {
                        drawRect(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFFAB47BC), Color(0xFF42A5F5))
                            )
                        )
                    }
            ) {
                Text("Gradient background and border", modifier = Modifier.align(Alignment.Center), color = Color.White)
            }
        }

        // ====== Card: Custom Content Color ======
        Text("Custom Content Color", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f),
            colors = CardDefaults.cardColors(contentColor = Color(0xFFD32F2F))
        ) {
            Text("Text uses custom content color (red)", modifier = Modifier.padding(16.dp))
        }

        // ====== Card: Custom Shape ======
        Text("Custom Shape", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f),
            shape = RoundedCornerShape(topStart = 32.dp, bottomEnd = 32.dp)
        ) {
            Text("Card with asymmetric rounded corners.", modifier = Modifier.padding(16.dp))
        }

        // ====== Card: Custom Elevation ======
        Text("Custom Elevation", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.9f),
            elevation = CardDefaults.cardElevation(defaultElevation = 24.dp)
        ) {
            Text("Card with high elevation (shadow)", modifier = Modifier.padding(16.dp))
        }

        // ====== Card: Custom Modifier (Width & Height) ======
        Text("Custom Modifier (Width & Height)", fontSize = 18.sp, color = Color.Black)
        Card(
            modifier = Modifier.fillMaxWidth(0.7f).height(80.dp)
        ) {
            Text("Width: 70%, Height: 80.dp", modifier = Modifier.padding(16.dp))
        }
    }
}
