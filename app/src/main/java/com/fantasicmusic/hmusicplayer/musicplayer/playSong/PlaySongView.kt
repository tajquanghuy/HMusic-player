package com.fantasicmusic.hmusicplayer.musicplayer.playSong

import com.fantasicmusic.hmusicplayer.musicplayer.BaseView
import com.fantasicmusic.hmusicplayer.musicplayer.model.Song

interface PlaySongView : BaseView {
    fun updateSongState(song: Song, isPlaying: Boolean, progress: Int)

    fun showRepeat(isRepeat: Boolean)

    fun showRandom(isRandom: Boolean)
}