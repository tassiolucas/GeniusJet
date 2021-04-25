package com.geniusjet.view

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.geniusjet.view.game.GameScreen

@Composable
fun GeniusContent() {
    val (drawerState, onDrawerStateChange) = state { DrawerState.Closed }

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
                is Screen.StartScreen -> StartScreen()
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