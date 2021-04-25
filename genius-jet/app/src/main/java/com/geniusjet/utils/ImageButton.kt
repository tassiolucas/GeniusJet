package com.geniusjet.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ImageButton(
    icon: Painter,
    onClick: () -> Unit
) {
    Surface(
        shape = MaterialTheme.shapes.small,
        color = Color.Transparent,
        elevation = 0.dp,
        modifier = Modifier.clickable(onClick = onClick)
    ) {
        Image(
            painter = icon,
            contentDescription = null
        )
    }
}

val minSize = 56.dp