package com.geniusjet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.setContent
import com.geniusjet.view.GeniusContent

class GeniusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeniusContent()
        }
    }
}



