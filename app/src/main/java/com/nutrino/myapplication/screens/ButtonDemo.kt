package com.nutrino.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nutrino.myapplication.R

@Composable
fun ButtonDemo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box( modifier = Modifier.background(
            brush = Brush.linearGradient(
                listOf(
                    Color.Blue,
                    Color.Red,
                    Color.Yellow,
                    Color.Magenta

                )
            ),
            shape = RoundedCornerShape(30.dp))
        ){
            Button(
                onClick = {

                },
                 
                colors = ButtonColors(
                    contentColor = Color.White,
                    containerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.Transparent
                ),
                modifier = Modifier.height(50.dp).fillMaxWidth(0.85f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text("Example")
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun ButtonDemoPrev() {
    Scaffold(

    ) {
        Box(modifier = Modifier.padding(it)){
            ButtonDemo()

        }

    }

}

