package com.geniusjet.view.game


import android.os.Handler
import androidx.compose.Composable
import androidx.compose.Looper
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import com.geniusjet.data.BoardData
import com.geniusjet.model.ButtonModel
import com.geniusjet.view.utils.ImageButton
import java.util.concurrent.TimeUnit

@Composable
fun ButtonJetGenius(button: ButtonModel) {
    val buttonImage = button.image ?: +imageResource(button.imageId)
    val buttonPressedImage = button.imagePressed ?: +imageResource(button.imagePressedId)

    val runnable = Runnable { button.status.isPressed = false }
    val action = {
        button.status.isPressed = true

        val handler = Handler().postDelayed(runnable, 1000)
    }

    val currentButton = if (button.status.isPressed)
        ImageButton(icon = buttonPressedImage)
    else
        ImageButton(icon = buttonImage, onClick = action)

    return currentButton
}

@Preview
@Composable
fun ButtonPreview() {
    val context = +ambient(ContextAmbient)
    val resources = context.resources

    ButtonJetGenius(BoardData[0])
}