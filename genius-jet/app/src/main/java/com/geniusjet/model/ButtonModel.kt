package com.geniusjet.model

data class ButtonModel (
    val id : Int,
    val imageId : Int,
    val imagePressedId : Int,
    val soundId: Int,
    var status: Status
)

data class Status(
    var isPressed : Boolean = false
)