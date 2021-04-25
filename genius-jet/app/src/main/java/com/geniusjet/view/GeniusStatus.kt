package com.geniusjet.view

sealed class Screen {
    object StartScreen : Screen()
    object Game : Screen()
}

object GeniusStatus {
    var currentScreen: Screen = Screen.StartScreen
    var isPlaying: Boolean = false
}