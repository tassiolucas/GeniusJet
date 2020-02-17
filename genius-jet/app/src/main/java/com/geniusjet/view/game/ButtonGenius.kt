package com.geniusjet.view.game

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.Gravity
import androidx.ui.layout.Row
import androidx.ui.material.Button
import androidx.ui.material.ButtonStyle
import androidx.ui.material.MaterialTheme
import com.geniusjet.model.ButtonGame
import com.geniusjet.view.utils.VectorImage

@Composable
fun ButtonGenius(
    id: Int,
    @DrawableRes vectorId: Int,
    isPressed: Boolean,
    action: (() -> Unit)?) {

    return Button(
        onClick= action,
        style = ButtonStyle(
            Color.Transparent, (+MaterialTheme.shapes()).button,
            paddings = EdgeInsets(0.dp)
        )
    ) {
        Row() {
            VectorImage(
                modifier = Gravity.Center,
                id = vectorId,
                tint = Color.Transparent
            )
        }
    }
}

@Composable
fun ButtonGenius(button : ButtonGame) {
    val action = {

    }

    return Button(
        onClick= action,
        style = ButtonStyle(
            Color.Transparent, (+MaterialTheme.shapes()).button,
            paddings = EdgeInsets(0.dp)
        )
    ) {
        Row() {
            VectorImage(
                modifier = Gravity.Center,
                id = button.vectorId,
                tint = Color.Transparent
            )
        }
    }
}