package com.geniusjet.view

import androidx.compose.Composable
import androidx.ui.animation.Transition
import androidx.ui.core.Text
import androidx.ui.core.drawWithContent
import androidx.ui.foundation.Border
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.res.colorResource
import androidx.ui.res.stringResource
import androidx.ui.text.TextStyle
import androidx.ui.unit.dp
import com.geniusjet.R
import com.geniusjet.utils.definition
import com.geniusjet.utils.rotation
import com.geniusjet.view.game.Board

@Composable
fun StartScreen() {
    Stack {
        startBoardDecoration()
        startButton()
    }
}

@Composable
private fun StackScope.startButton() {
    val action = {
        println("Clicou")
    }

    Container(modifier = LayoutWidth.Fill + LayoutHeight.Fill) {
        Button(
            backgroundColor = colorResource(id = R.color.startButtonColor),
            border = Border(3.dp, colorResource(id = R.color.startButtonBorderColor)),
            onClick = action
        ) {
            Text (
                text = stringResource(R.string.start_button_label),
                style = TextStyle(Color.White)
            )
        }
    }
}

@Composable
private fun StackScope.startBoardDecoration() {
    Transition(definition = definition, initState = 0, toState = 1) { transitionState ->
        val drawModifier = drawWithContent { canvas, parentSize ->
            val halfWidth = parentSize.width.value / 2
            val halfHeight = parentSize.height.value / 2

            canvas.save()
            canvas.translate(halfWidth, halfHeight)
            canvas.rotate(transitionState[rotation])
            canvas.translate(-halfWidth, -halfHeight)
            drawChildren()
            canvas.restore()
        }

        Container(modifier = LayoutWidth.Fill + LayoutHeight.Fill) {
            Container(
                modifier = drawModifier +
                        LayoutPadding(10.dp)
            ) {
                Board(25.dp)
            }
        }
    }
}