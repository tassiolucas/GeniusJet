package com.geniusjet.utils

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Modifier
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.SimpleImage
import androidx.ui.graphics.Color
import androidx.ui.graphics.Image
import androidx.ui.layout.Container
import androidx.ui.layout.DpConstraints
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface

@Composable
fun ImageButton(
    icon: Image,
    modifier: Modifier = Modifier.None,
    onClick: (() -> Unit)? = null
) {
    Surface(modifier = modifier, shape = (+MaterialTheme.shapes()).card, color = Color.Transparent, elevation = 0.dp) {
        Clickable(onClick = onClick) {
            Container(constraints = DpConstraints(minWidth = minSize, minHeight = minSize)) {
                SimpleImage(image = icon)
            }
        }
    }
}

val minSize = 56.dp