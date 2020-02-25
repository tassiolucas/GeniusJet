package com.geniusjet.view

import androidx.compose.Model

sealed class Screen {
    object Game : Screen()
}

@Model
object GeniusStatus {
    var currentScreen: Screen = Screen.Game
    var isPlaying: Boolean = false
}