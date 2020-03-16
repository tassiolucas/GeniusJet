package com.geniusjet.view.game

import androidx.compose.Composable
import androidx.ui.layout.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.Dp
import androidx.ui.unit.dp
import com.geniusjet.GeniusApp.Companion.context
import com.geniusjet.data.BoardData

@Composable
fun GameScreen() {
    Column() {
        Spacer(modifier = LayoutPadding(top = 100.dp))
        Container() {
            Board()
        }
    }
}

@Composable
fun Board(aditionalPadding: Dp = Dp(0F)) {
    val data = BoardData
    val padding = 5.dp

    Column(modifier = LayoutPadding(padding)) {
        Row(modifier = LayoutPadding(bottom = padding + aditionalPadding)) {
            Container(modifier = LayoutPadding(start = padding + (aditionalPadding / 2) , end = padding + (aditionalPadding / 2))) {
                ButtonJetGenius(
                    button = data[0]
                )
            }
            Container(modifier = LayoutPadding(start = padding + (aditionalPadding / 2), end = padding + (aditionalPadding / 2))) {
                ButtonJetGenius(
                    button = data[1]
                )
            }
        }
        Row(modifier = LayoutPadding(top = padding)) {
            Container(modifier = LayoutPadding(start = padding + (aditionalPadding / 2), end = padding + (aditionalPadding / 2))) {
                ButtonJetGenius(
                    button = data[2]
                )
            }
            Container(modifier = LayoutPadding(start = padding + (aditionalPadding / 2), end = padding + (aditionalPadding / 2))) {
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
    GameScreen()
}