package com.geniusjet.model

import androidx.compose.Model
import androidx.ui.graphics.Image

data class ButtonModel (
    val id : Int,
    val imageId : Int,
    val imagePressedId : Int,
    val image : Image? = null,
    val imagePressed : Image? = null,
    val sound: Int? = null,
    var status: Status
)

@Model
class Status {
    var isPressed : Boolean = false
}