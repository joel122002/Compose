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
            // Modifiers are applied sequentially. The below code will give you three nested borders
            // of width 10dp each. The outermost border is black, the innermost border is red and
            // the one in between is blue.
            Column(modifier = Modifier
                // Takes full screen width
                .fillMaxWidth()
                // Takes 70% of the screen height
                .fillMaxHeight(0.7f)
                // Create a black border of 10dp
                .border(10.dp, Color.Black)
                // Applies padding of 10 dp. This means the next border i.e. the blue one has a
                // padding on 10dp from the view i.e. the column
                .padding(10.dp)
                // Creates a blue border of 10dp having padding 10dp
                .border(10.dp, Color.Blue)
                // Applies padding of 10 dp. This means the next border i.e. the red one has a
                // total padding on 20dp from the view i.e. the column
                .padding(10.dp)
                // Creates a red border of 10dp having padding 20dp
                .border(10.dp, Color.Red)
                // Creates a padding for the content inside the column
                .padding(10.dp)) {
                Text(text = "Hello", modifier = Modifier
                    // Offset is like a margin but it doesn't affect other elements, i.e. it won't
                    // push the other elements and so can be used to overlap 2 elements
                    .offset(10.dp, 10.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp))
                Text(text = "World", modifier = Modifier
                    // Note we're giving the same offset as the two texts would overlap if this
                    // didn't have an offset
                    .offset(10.dp, 10.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp))
            }
        }
    }
}