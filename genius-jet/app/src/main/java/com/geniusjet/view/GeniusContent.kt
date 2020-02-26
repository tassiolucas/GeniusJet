package com.geniusjet.view

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.animation.Crossfade
import androidx.ui.graphics.Color
import androidx.ui.material.DrawerState
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ModalDrawerLayout
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import com.geniusjet.view.game.GameScreen

@Composable
fun GeniusContent() {
    val (drawerState, onDrawerStateChange) = +state { DrawerState.Closed }

    MaterialTheme {
        ModalDrawerLayout(
            drawerState = drawerState,
            onStateChange = onDrawerStateChange,
            gesturesEnabled = false,
            drawerContent = {},
            bodyContent = { AppContent { onDrawerStateChange(DrawerState.Opened) } }
        )
    }
}

@Composable
private fun AppContent(openDrawer: () -> Unit) {
    Crossfade(GeniusStatus.currentScreen) { screen ->
        Surface(color = Color.DarkGray) {
            when (screen) {
                is Screen.Game -> GameScreen()
            }
        }
    }
}

@Preview
@Composable
fun preview() {
    GeniusContent()
}