package com.geniusjet.view

import androidx.compose.Model

sealed class Screen {
    object StartScreen : Screen()
    object Game : Screen()
}

@Model
object GeniusStatus {
    var currentScreen: Screen = Screen.StartScreen
    var isPlaying: Boolean = false
}