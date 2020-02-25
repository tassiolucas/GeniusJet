package com.geniusjet.data

import android.content.res.Resources
import androidx.ui.graphics.imageFromResource
import com.geniusjet.R
import com.geniusjet.model.ButtonModel
import com.geniusjet.model.Status

val BoardData = listOf (
    ButtonModel(id = 1, imageId = R.drawable.ic_red_button_genius, imagePressedId = R.drawable.ic_glow_red_button_genius, status = Status()),
    ButtonModel(id = 2, imageId = R.drawable.ic_blue_button_genius, imagePressedId = R.drawable.ic_glow_blue_button_genius, status = Status()),
    ButtonModel(id = 3, imageId = R.drawable.ic_green_button_genius, imagePressedId = R.drawable.ic_glow_green_button_genius, status = Status()),
    ButtonModel(id = 4, imageId = R.drawable.ic_yellow_button_genius, imagePressedId = R.drawable.ic_glow_yellow_button_genius, status = Status())
)

fun getButtonsWithImagesLoaded(buttons: List<ButtonModel>, resources: Resources) : List<ButtonModel> {
    return buttons.map {
        it.copy(
            image = imageFromResource(resources, it.imageId),
            imagePressed = imageFromResource(resources, it.imagePressedId)
        )
    }
}