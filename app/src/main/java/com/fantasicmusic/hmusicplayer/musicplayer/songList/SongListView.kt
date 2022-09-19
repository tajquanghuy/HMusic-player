package com.fantasicmusic.hmusicplayer.musicplayer.songList

import com.fantasicmusic.hmusicplayer.musicplayer.BaseView
import com.fantasicmusic.hmusicplayer.musicplayer.model.Song

interface SongListView : BaseView {
    fun showLoading()

    fun stopLoading()

    fun updateSongState(song: Song, isPlaying: Boolean)

    fun onSongClick()
}