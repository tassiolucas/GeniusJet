package com.geniusjet.view.game

import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.dp
import androidx.ui.layout.*
import androidx.ui.tooling.preview.Preview
import com.geniusjet.data.BoardData

@Composable
fun GameScreen() {
    Column(modifier = Expanded) {
        HeightSpacer(height = 100.dp)
        Container(modifier = ExpandedWidth) {
            Board()
        }
    }
}

@Composable
fun Board() {
    val context = +ambient(ContextAmbient)
    val data = BoardData
    val padding = 5.dp

    Column(modifier = Spacing(padding)) {
        Row(modifier = Spacing(bottom = padding)) {
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonGenius(
                    button = data[0]
                )
            }
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonGenius(
                    button = data[1]
                )
            }
        }

        Row(modifier = Spacing(top = padding)) {
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonGenius(
                    button = data[2]
                )
            }
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonGenius(
                    button = data[3]
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    GameScreen()
}