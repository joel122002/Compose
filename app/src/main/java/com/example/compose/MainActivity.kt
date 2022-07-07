package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set content sets the view for the current activity.
        setContent {
            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .height(200.dp)
            ) {
                // painterResource allows us to use a image from the res folder
                val painter = painterResource(id = R.drawable.snow_owl)
                val title = "This is a snow owl"
                val contentDescription = "Image of snow owl"
                ImageCard(painter = painter, title = title, contentDescription = contentDescription)
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    title: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxSize(),
        // Gives rounded corners to the card
        shape = RoundedCornerShape(15.dp),
        // Gives an elevation to the card giving it a shadow
        elevation = 5.dp
    ) {
        // Boxes allow to stack UI components on top of each other. As in this case we want the text
        // stacked on the gradient which is stacked on the image
        Box(modifier = Modifier
            .fillMaxSize()
        ) {
            // The image composable is an image container
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    // Is used to give gradient
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        // Point from where we want the grandient to start
                        startY = 300f
                    )
                )
            )
            Box(modifier = Modifier.fillMaxSize(),
            // content alignment can be used with a box to align child composables
            contentAlignment = Alignment.BottomStart) {
                Text(text = title, color = Color.White, fontSize = 16.sp, modifier = Modifier.padding(10.dp))
            }
        }
    }
}