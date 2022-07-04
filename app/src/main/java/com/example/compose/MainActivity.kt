package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set content sets the view for the current activity.
        setContent {
            Greeting("there!!")
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