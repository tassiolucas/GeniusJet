package com.geniusjet.view.game

import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.layout.*
import androidx.ui.res.imageResource
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
    val data = BoardData
    val padding = 5.dp

    Column(modifier = Spacing(padding)) {
        Row(modifier = Spacing(bottom = padding)) {
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonJetGenius(
                    button = data[0]
                )
            }
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonJetGenius(
                    button = data[1]
                )
            }
        }
        Row(modifier = Spacing(top = padding)) {
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonJetGenius(
                    button = data[2]
                )
            }
            Container(modifier = Spacing(left = padding, right = padding)) {
                ButtonJetGenius(
                    button = data[3]
                )
            }
        }
    }
}

@Preview
@Composable
fun GameScreenPreview() {
    val context = +ambient(ContextAmbient)
    val resources = context.resources

    GameScreen()
}