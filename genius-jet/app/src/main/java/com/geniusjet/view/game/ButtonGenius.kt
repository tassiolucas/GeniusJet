package com.geniusjet.view.game

import android.os.Handler
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.res.ResourcesCompat
import com.geniusjet.data.BoardData
import com.geniusjet.model.ButtonModel
import com.geniusjet.utils.AudioPlayer
import com.geniusjet.utils.ImageButton
import com.geniusjet.view.GeniusStatus.isPlaying

@Composable
fun ButtonJetGenius(button: ButtonModel) {
    val buttonImage = painterResource(id = button.imageId)
    val buttonPressedImage = painterResource(id = button.imagePressedId)

    val runnable = Runnable { button.status.isPressed = false }
    val action = {
        if (!isPlaying) {
            button.status.isPressed = true
            AudioPlayer.play(button)
            val handler = Handler().postDelayed(runnable, 1000)
        }
    }

    return if (button.status.isPressed)
        ImageButton(icon = buttonPressedImage) { }
    else
        ImageButton(icon = buttonImage, onClick = action)
}

@Preview
@Composable
fun ButtonPreview() {
    ButtonJetGenius(BoardData[0])
}