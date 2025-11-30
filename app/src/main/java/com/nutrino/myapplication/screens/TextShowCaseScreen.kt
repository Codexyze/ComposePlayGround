package com.nutrino.myapplication.screens

// ✅ All necessary imports
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider // For horizontal line separator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 🎨 Main Composable Function
@Composable
fun TextShowcaseScreen() {

    // rememberScrollState() keeps track of current scroll position
    val scrollState = rememberScrollState()

    // Column to arrange text elements vertically
    Column(
        modifier = Modifier
            .fillMaxSize() // Fill available screen space
            .verticalScroll(scrollState) // Make it scrollable vertically
            .padding(16.dp) // Outer padding for breathing space
    ) {

        // 🟩 1. Basic Text Example
        Text(
            text = "Hello World - Basic Text ",
            fontSize = 20.sp // Simple text with defined size

        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 2. Text with Custom Color
        Text(
            text = "Hello World - Colored",
            color = Color.Red, // Change text color
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 3. Bold Text Example
        Text(
            text = "Hello World - Bold Text",
            fontWeight = FontWeight.Bold, // Makes text bold
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 4. Italic Text Example
        Text(
            text = "Hello World - Italic Style",
            fontStyle = FontStyle.Italic, // Italicize text
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 5. Underline & Strikethrough Text
        Text(
            text = "Hello World - Underlined",
            textDecoration = TextDecoration.Underline, // Add underline
            fontSize = 22.sp
        )
        Text(
            text = "Hello World - Strike Through",
            textDecoration = TextDecoration.LineThrough, // Add strike line
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 6. Combine Multiple Decorations
        Text(
            text = "Hello World - Underline + Strike",
            textDecoration = TextDecoration.combine(
                listOf(TextDecoration.Underline, TextDecoration.LineThrough)
            ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 7. Custom Font Family
        Text(
            text = "Hello World - Cursive Font",
            fontFamily = FontFamily.Cursive, // Built-in font family
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 8. Letter Spacing Example
        Text(
            text = "Hello World - Spaced Letters",
            letterSpacing = 4.sp, // Adds space between characters
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 9. Text Alignment (Center, End)
        Text(
            text = "Hello World - Centered Text",
            textAlign = TextAlign.Center, // Align text to center
            modifier = Modifier.fillMaxWidth(), // Alignment works only with full width
            fontSize = 22.sp
        )
        Text(
            text = "Hello World - Right Aligned",
            textAlign = TextAlign.End, // Align text to right
            modifier = Modifier.fillMaxWidth(),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 10. Overflow Example (Ellipsis)
        Text(
            text = "Hello World - This is a very very long text that will get truncated at some point...",
            maxLines = 1, // Limit to one line
            overflow = TextOverflow.Ellipsis, // Add "..." when too long
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 11. Text Shadow Example
        Text(
            text = "Hello World - Shadow Effect",
            fontSize = 22.sp,
            color = Color.Blue,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black, // Shadow color
                    offset = Offset(4f, 4f), // Offset X and Y
                    blurRadius = 3f // Smooth blur radius
                )
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 12. Custom Font Size & Weight
        Text(
            text = "Hello World - Bold & Big",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 28.sp,
            color = Color(0xFF00796B) // Custom teal hex color
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 13. Annotated String (Rich Text)
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Red, fontSize = 24.sp)) {
                    append("Hello ")
                }
                withStyle(style = SpanStyle(color = Color.Blue, fontWeight = FontWeight.Bold)) {
                    append("World")
                }
                withStyle(style = SpanStyle(color = Color.Green, fontStyle = FontStyle.Italic)) {
                    append(" Compose")
                }
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 14. Line Height Example
        Text(
            text = "Hello\nWorld\nWith\nLineHeight",
            lineHeight = 40.sp, // Space between lines
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 15. Text with Background Modifier
        Text(
            text = "Hello World - With Background",
            color = Color.White, // Text color white
            fontSize = 22.sp,
            modifier = Modifier
                .background(Color.Black) // Black box behind text
                .padding(8.dp) // Inner padding
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 16. Rotated Text Example
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Hello World - Rotated!",
                modifier = Modifier.rotate(-10f), // Tilt text by -10 degrees
                fontSize = 24.sp,
                color = Color.Magenta
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 17. Uppercase Example
        Text(
            text = "hello world".uppercase(),
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF6200EE)
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()

        // 🟩 18. Lowercase Example
        Text(
            text = "HELLO WORLD".lowercase(),
            fontSize = 22.sp,
            fontWeight = FontWeight.Light,
            color = Color(0xFF009688)
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()
        //style text with 3 gradient
        Text(text = "Hello catesh", style = TextStyle(brush =
            Brush.linearGradient(
                colors = listOf(Color.Red, Color.Yellow, Color.Green, Color.Blue, Color.Magenta)
            )
        ), fontSize = 45.sp)
        Spacer(modifier = Modifier.height(50.dp)) // Padding at the bottom
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextShowcaseScreenPreview() {
    TextShowcaseScreen()
}