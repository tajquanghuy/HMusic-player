package com.pigllet.hmusicplayer.musicplayer.songList

import com.pigllet.hmusicplayer.musicplayer.BaseView
import com.pigllet.hmusicplayer.musicplayer.model.Song

interface SongListView : BaseView {
    fun showLoading()

    fun stopLoading()

    fun updateSongState(song: Song, isPlaying: Boolean)

    fun onSongClick()
}