package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set content sets the view for the current activity.
        setContent {
            // If we don't place this here column and row will overlap
            Column() {
                // Places children one below the other. By default if you don't use column they will
                // overlap
                Column {
                    Greeting("there!!")
                    Greeting("world!!")
                    Greeting("earth")
                }
                // Places children one after the other. By default if you don't use row they will
                // overlap
                Row {
                    Greeting("there!!")
                    Greeting("world!!")
                    Greeting("earth")
                }
                // Parameters help give properties to a composable
                Column (
                    modifier = Modifier
                        .height(90.dp)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .border(2.dp, Color.Black),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Greeting("there!!")
                    Greeting("world!!")
                    Greeting("earth")
                }
            }
        }
    }
}

// This is a composable which is like a view
@Composable
fun Greeting(name: String) {
    // Text() displays some text
    Text(text = "Hello $name!")
}

// This is a composable for previewing the Greeting composable in android studio. This has no real
// use in an app. It is only for the developer to preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Android")
}