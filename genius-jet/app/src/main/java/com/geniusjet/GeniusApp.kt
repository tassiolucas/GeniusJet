package com.geniusjet

import android.app.Application
import android.content.Context

class GeniusApp : Application() {

    override fun onCreate() {
        context = applicationContext
        super.onCreate()
    }

    companion object {
        lateinit var context: Context
            private set
    }
}