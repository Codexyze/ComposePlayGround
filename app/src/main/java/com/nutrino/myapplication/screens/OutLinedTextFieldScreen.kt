// Package declaration - defines where this file belongs in the project structure
package com.nutrino.myapplication.screens

// Layout imports for spacing, sizing, and scrollable content
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField

// Material Icons - pre-built icons from Material Design library
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff

// Material3 components - latest Material Design UI components
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

// Compose runtime imports for managing state and lifecycle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

// UI-related imports for alignment, modifiers, and styling
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * OutLinedTextFieldScreen - A comprehensive screen demonstrating all types of TextField variations
 * in Jetpack Compose with gradient text effects
 *
 * This screen showcases:
 * - OutlinedTextField (bordered text input)
 * - TextField (filled text input)
 * - BasicTextField (minimal, customizable text input)
 *
 * Features demonstrated:
 * - Gradient text coloring using Brush
 * - Labels and placeholders
 * - Leading and trailing icons
 * - Password visibility toggle
 * - Error states and validation
 * - Supporting text (helper/counter text)
 * - Prefix and suffix text
 * - Multiline input
 * - Disabled and read-only states
 */
@Composable
fun OutLinedTextFieldScreen() {
    // ============ State Management ============
    // Each text field needs its own state variable to store the current text value
    // 'remember' ensures the state survives recomposition
    // 'mutableStateOf' creates a state holder that triggers recomposition when changed
    // 'by' keyword allows direct access to the value without using .value

    // State for basic OutlinedTextField with no extra features
    var basicText by remember { mutableStateOf("") }

    // State for OutlinedTextField with label
    var textWithLabel by remember { mutableStateOf("") }

    // State for placeholder demonstration (unused in current implementation)
    var textWithPlaceholder by remember { mutableStateOf("") }

    // State for text field with leading icon
    var textWithIcons by remember { mutableStateOf("") }

    // State for email input field
    var emailText by remember { mutableStateOf("") }

    // State for password input
    var passwordText by remember { mutableStateOf("") }

    // Boolean state to toggle password visibility (show/hide password)
    var passwordVisible by remember { mutableStateOf(false) }

    // State for demonstrating error validation
    var errorText by remember { mutableStateOf("") }

    // State for disabled text field (pre-filled, cannot be edited due to enabled=false)
    var disabledText by remember { mutableStateOf("Disabled Text") }

    // State for read-only text field (pre-filled, cannot be edited due to readOnly=true)
    var readOnlyText by remember { mutableStateOf("Read Only Text") }

    // State for text field with character counter
    var supportingText by remember { mutableStateOf("") }

    // State for text field with prefix ($) and suffix (USD)
    var prefixSuffixText by remember { mutableStateOf("") }

    // State for multiline text input
    var multilineText by remember { mutableStateOf("") }

    // State for regular Material3 TextField (filled style)
    var normalTextField by remember { mutableStateOf("") }

    // State for BasicTextField (completely unstyled)
    var basicTextField by remember { mutableStateOf("") }

    // State for OutlinedTextField with manual color configuration
    var manualColoredText by remember { mutableStateOf("") }

    // ============ Layout Container ============
    // LazyColumn - A vertically scrolling list that only composes and lays out visible items
    // Similar to RecyclerView in traditional Android, but more efficient and easier to use
    LazyColumn(
        // fillMaxSize() makes the LazyColumn occupy all available space in parent
        modifier = Modifier.fillMaxSize(),
        // Centers all child elements horizontally within the LazyColumn
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // item {} - defines a single item in the LazyColumn
        // All text fields are placed in one item here, but they could be separate items
        item {
            // ============ Gradient Brush Setup ============
            // Create a gradient brush that will color the text with multiple colors
            // 'remember' caches this brush so it's not recreated on every recomposition
            val brush = remember {
                // linearGradient - creates a gradient that transitions smoothly between colors
                // The gradient flows from left to right through all the colors in order
                Brush.linearGradient(
                    colors = listOf(
                        Color.Red,      // First color - starts from left
                        Color.Yellow,   // Transitions to yellow
                        Color.Green,    // Then to green
                        Color.Blue,     // Then to blue
                        Color.Magenta   // Ends with magenta on the right
                    )
                )
            }

            // ============ Example 1: Basic OutlinedTextField ============
            // The simplest OutlinedTextField with just text input and gradient styling
            OutlinedTextField(
                // value - the current text being displayed
                value = basicText,
                // onValueChange - callback triggered when user types
                // 'it' represents the new text value
                onValueChange = { basicText = it },
                // Modifier.fillMaxWidth(0.85f) makes the field 85% of screen width
                modifier = Modifier.fillMaxWidth(0.85f),
                // textStyle applies the gradient brush to the typed text
                textStyle = TextStyle(brush = brush)
            )

            // Spacer adds vertical spacing (gap) of 16dp between components
            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 2: OutlinedTextField with Label and Placeholder ============
            // Demonstrates how to add descriptive text for the field
            OutlinedTextField(
                value = textWithLabel,
                onValueChange = { textWithLabel = it },
                // label - Text that floats above the field when focused or filled
                // Appears inside the field border when empty and unfocused
                label = { Text("Name") },
                // placeholder - Hint text shown inside the field when it's empty
                // Disappears when user starts typing
                placeholder = { Text("Enter your name") },
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 3: OutlinedTextField with Leading Icon ============
            // Shows how to add an icon on the left side of the text field
            OutlinedTextField(
                value = textWithIcons,
                onValueChange = { textWithIcons = it },
                label = { Text("Username") },
                // leadingIcon - Icon displayed at the start (left side) of the field
                // Icons.Default.Person is a pre-built Material Design icon
                leadingIcon = {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Person" // Accessibility description
                    )
                },
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 4: OutlinedTextField with Leading and Trailing Icons ============
            // Demonstrates both leading (left) and trailing (right) icons
            OutlinedTextField(
                value = emailText,
                onValueChange = { emailText = it },
                label = { Text("Email") },
                placeholder = { Text("example@email.com") },
                // leadingIcon - Email icon on the left
                leadingIcon = {
                    Icon(Icons.Default.Email, contentDescription = "Email")
                },
                // trailingIcon - Icon/content on the right side
                // This shows a green checkmark when text is entered
                trailingIcon = {
                    // Conditional display - only show checkmark if field has text
                    if (emailText.isNotEmpty()) {
                        Text("✓", color = Color.Green)
                    }
                },
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 5: Password Field with Visibility Toggle ============
            // Advanced example showing password masking and toggle functionality
            OutlinedTextField(
                value = passwordText,
                onValueChange = { passwordText = it },
                label = { Text("Password") },
                placeholder = { Text("Enter password") },
                // Lock icon indicates secure field
                leadingIcon = {
                    Icon(Icons.Default.Lock, contentDescription = "Lock")
                },
                // trailingIcon - IconButton that toggles password visibility
                trailingIcon = {
                    // IconButton - Clickable button containing an icon
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            // Switch between Visibility and VisibilityOff icons
                            imageVector = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                            // Accessibility text for screen readers
                            contentDescription = if (passwordVisible) "Hide password" else "Show password"
                        )
                    }
                },
                // visualTransformation - Controls how text is displayed
                // PasswordVisualTransformation masks text with dots (•••)
                // VisualTransformation.None shows plain text
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 6: OutlinedTextField with Error State ============
            // Demonstrates validation and error display
            OutlinedTextField(
                value = errorText,
                onValueChange = { errorText = it },
                label = { Text("Required Field") },
                // isError - Boolean that changes the field's appearance to red when true
                // This field shows error when empty
                isError = errorText.isEmpty(),
                // supportingText - Helper text shown below the field
                // Used here to display error message
                supportingText = {
                    // Only show error text when field is empty
                    if (errorText.isEmpty()) {
                        Text("This field is required", color = Color.Red)
                    }
                },
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 7: OutlinedTextField with Character Counter ============
            // Shows how to display a character count using supportingText
            OutlinedTextField(
                value = supportingText,
                onValueChange = { supportingText = it },
                label = { Text("Bio") },
                // supportingText displays dynamic character count
                // ${supportingText.length} gets the current text length
                supportingText = {
                    Text("${supportingText.length}/100 characters")
                },
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 8: OutlinedTextField with Prefix and Suffix ============
            // Useful for currency, measurements, or units
            OutlinedTextField(
                value = prefixSuffixText,
                onValueChange = { prefixSuffixText = it },
                label = { Text("Price") },
                // prefix - Text displayed before the user's input (inside the field)
                prefix = { Text("$") },
                // suffix - Text displayed after the user's input (inside the field)
                suffix = { Text("USD") },
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 9: Multiline OutlinedTextField ============
            // Expands vertically to accommodate multiple lines of text
            OutlinedTextField(
                value = multilineText,
                onValueChange = { multilineText = it },
                label = { Text("Description") },
                placeholder = { Text("Enter description...") },
                // minLines - Minimum number of visible text lines (starts at this height)
                minLines = 3,
                // maxLines - Maximum number of visible lines before scrolling
                maxLines = 5,
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 10: Disabled OutlinedTextField ============
            // User cannot interact with this field (grayed out appearance)
            OutlinedTextField(
                value = disabledText,
                onValueChange = { disabledText = it },
                label = { Text("Disabled") },
                // enabled = false - Field is visible but cannot be edited or focused
                // Typically used for fields that are conditionally editable
                enabled = false,
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 11: Read-Only OutlinedTextField ============
            // User can see and select text, but cannot edit it
            OutlinedTextField(
                value = readOnlyText,
                onValueChange = { readOnlyText = it },
                label = { Text("Read Only") },
                // readOnly = true - Field can be focused and text can be selected/copied
                // but the user cannot modify the text
                // Different from disabled: field is fully interactive except for editing
                readOnly = true,
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 12: Regular TextField (Filled Style) ============
            // Material3 TextField with filled background (different from OutlinedTextField)
            // This is the standard Material Design text field with a filled appearance
            TextField(
                value = normalTextField,
                onValueChange = { normalTextField = it },
                label = { Text("TextField (Filled)") },
                placeholder = { Text("This is a filled TextField") },
                // TextField has a solid background color instead of just a border
                // It follows Material Design 3 guidelines for filled text fields
                modifier = Modifier.fillMaxWidth(0.85f),
                textStyle = TextStyle(brush = brush)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 13: BasicTextField - Completely Unstyled ============
            // The most basic text input with no Material Design styling
            // Gives you complete control over appearance
            BasicTextField(
                value = basicTextField,
                onValueChange = { basicTextField = it },
                // Apply gradient text style directly
                textStyle = TextStyle(brush = brush),
                modifier = Modifier.fillMaxWidth(0.85f),
                // decorationBox - Allows you to wrap the text field with custom UI
                // innerTextField() is the actual editable text area
                decorationBox = { innerTextField ->
                    // Show placeholder when field is empty
                    if (basicTextField.isEmpty()) {
                        Text("BasicTextField - No border", color = Color.Gray)
                    }
                    // Always call innerTextField() to render the actual input
                    innerTextField()
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // ============ Example 14: OutlinedTextField with Manual Custom Colors ============
            // This example shows how to manually customize all border and text colors
            OutlinedTextField(
                value = manualColoredText,
                onValueChange = { manualColoredText = it },
                label = { Text("Custom Colors") },
                placeholder = { Text("Manual color configuration") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = null,
                        tint = Color.Green
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = null
                    )
                },
                modifier = Modifier.fillMaxWidth(0.85f),
                // colors - override default Material colors with manually chosen ones
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF6200EE),      // Purple border when focused
                    unfocusedBorderColor = Color(0xFFE53E3E),    // Gray border when not focused
                    errorBorderColor = Color.Red,                // Red border in error state
                    focusedLabelColor = Color(0xFFE53D09),       // Label color when focused
                    unfocusedLabelColor = Color(0xFF616161),     // Label color when not focused
                    cursorColor = Color(0xFFA59930),             // Caret color
                    focusedTextColor = Color.Black,              // Text color when focused
                    unfocusedTextColor = Color.DarkGray          // Text color when not focused
                )
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

// ============ Preview Function ============
// @Preview annotation allows you to see this composable in Android Studio's preview pane
// without running the app on a device or emulator
@Preview(
    showBackground = true,  // Shows a white background in preview
    showSystemUi = true     // Shows system UI elements like status bar and navigation bar
)
@Composable
private fun OutlinedPreview() {
    // Adding top spacing so content doesn't start at the very top in preview
    Spacer(modifier = Modifier.height(100.dp))
    // Display the main screen composable
    OutLinedTextFieldScreen()
}