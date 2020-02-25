package com.geniusjet.model

import androidx.compose.Model

data class ButtonModel (
    val id : Int,
    val imageId : Int,
    val imagePressedId : Int,
    val soundId: Int,
    var status: Status
)

@Model
class Status {
    var isPressed : Boolean = false
}