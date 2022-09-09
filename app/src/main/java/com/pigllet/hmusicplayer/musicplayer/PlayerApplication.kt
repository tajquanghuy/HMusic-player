package com.pigllet.hmusicplayer.musicplayer

import android.app.Application
import androidx.viewbinding.BuildConfig
import timber.log.Timber

class PlayerApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}