package com.pigllet.hmusicplayer.musicplayer.playSong

import com.pigllet.hmusicplayer.musicplayer.BaseView
import com.pigllet.hmusicplayer.musicplayer.model.Song

interface PlaySongView : BaseView {
    fun updateSongState(song: Song, isPlaying: Boolean, progress: Int)

    fun showRepeat(isRepeat: Boolean)

    fun showRandom(isRandom: Boolean)
}