package com.geniusjet.view

import android.os.Bundle
import android.widget.Space
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Context
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview
import com.geniusjet.R
import com.geniusjet.view.utils.VectorImage

class GeniusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Container(alignment = Alignment.TopCenter, padding = EdgeInsets(top = 100 .dp)) {
                    Board()
                }
            }
        }
    }
}

@Composable
fun GeniusButton() {

}

@Composable
fun Board() {
    val context = +ambient(ContextAmbient)
    val padding = 5.dp

    Column(modifier = Spacing(padding)) {
        Row(modifier = Spacing(bottom = padding)) {
            Container(modifier = Spacing(left = padding, right = padding)) {
                BotaoGenius(
                    context = context,
                    id = R.drawable.ic_red_botao_genius,
                    isPressed = false,
                    action = null
                )
            }
            Container(modifier = Spacing(left = padding, right = padding)) {
                BotaoGenius(
                    context = context,
                    id = R.drawable.ic_blue_botao_genius,
                    isPressed = false,
                    action = null
                )
            }
        }

        Row(modifier = Spacing(top = padding)) {
            Container(modifier = Spacing(left = padding, right = padding)) {
                BotaoGenius(
                    context = context,
                    id = R.drawable.ic_green_botao_genius,
                    isPressed = false,
                    action = null
                )
            }
            Container(modifier = Spacing(left = padding, right = padding)) {
                BotaoGenius(
                    context = context,
                    id = R.drawable.ic_yellow_botao_genius,
                    isPressed = false,
                    action = null
                )
            }
        }
    }
}

@Composable
fun BotaoGenius(
    context: Context,
    @DrawableRes id: Int,
    isPressed: Boolean,
    action: (() -> Unit)?) {

    return Button(onClick= action, style = ButtonStyle(Color.Transparent, (+MaterialTheme.shapes()).button, paddings = EdgeInsets(0.dp))) {
        Row() {
            VectorImage(
                modifier = Gravity.Center,
                id = id,
                tint = Color.Transparent
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Board()
}