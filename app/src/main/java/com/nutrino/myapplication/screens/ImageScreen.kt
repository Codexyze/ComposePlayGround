package com.nutrino.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.nutrino.myapplication.R

// ImageScreen displays an image and a label in a vertical column
@Preview
@Composable
fun ImageScreen() {
    val context = LocalContext.current
    val sepiaMatrix = ColorMatrix(
        floatArrayOf(
            0.393f, 0.769f, 0.189f, 0f, 0f,
            0.349f, 0.686f, 0.168f, 0f, 0f,
            0.272f, 0.534f, 0.131f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
    )
    // Column arranges children vertically
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp), // Fill width and add padding
        verticalArrangement = Arrangement.Center, // Center children vertically
        horizontalAlignment = Alignment.CenterHorizontally // Center children horizontally
    ) {
        // Display an image from resources
        Image(
            painter = painterResource(R.drawable.intents),
            contentDescription = null,
            modifier = Modifier.size(250.dp),
            contentScale = ContentScale.Fit
        )
        // Spacer can be added here for spacing if needed
        Spacer(modifier = Modifier.height(25.dp))

        AsyncImage(
            model = "https://picsum.photos/400",
            placeholder = painterResource(R.drawable.ic_launcher_background),
            contentDescription ="Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RectangleShape).size(500.dp),
            error =  painterResource(R.drawable.ic_launcher_background),
            colorFilter = ColorFilter.colorMatrix(sepiaMatrix)
        )
        // Display a label below the image
        Text(text = "Image Example")
    }

}