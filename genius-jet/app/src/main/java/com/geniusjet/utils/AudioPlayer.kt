package com.geniusjet.utils

import android.media.MediaPlayer
import com.geniusjet.GeniusApp
import com.geniusjet.model.ButtonModel
import com.geniusjet.view.GeniusStatus

object AudioPlayer {

    fun play(button : ButtonModel) {

        val audioPlayer = MediaPlayer.create(GeniusApp.context, button.soundId)

        audioPlayer.apply {

            val audioPlayerPrepareListener = MediaPlayer.OnPreparedListener {
                GeniusStatus.isPlaying = true
                start()
            }

            setOnPreparedListener(audioPlayerPrepareListener)

            setOnCompletionListener {
                GeniusStatus.isPlaying = false
            }
        }
    }
}


