package com.fantasicmusic.hmusicplayer.musicplayer.songList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fantasicmusic.hmusicplayer.databinding.AdapterSongListBinding
import com.fantasicmusic.hmusicplayer.musicplayer.model.Song
import com.fantasicmusic.hmusicplayer.musicplayer.model.TimeUtil

class SongListAdapter(private val presenter: SongListPresenter) :
    RecyclerView.Adapter<SongListAdapter.SongHolder>() {
    inner class SongHolder(val viewBinding: AdapterSongListBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        init {
            itemView.setOnClickListener {
                presenter.onSongClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongHolder {
        val viewBinding =
            AdapterSongListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongHolder(viewBinding)
    }

    override fun getItemCount(): Int = presenter.getItemCount()

    override fun onBindViewHolder(holder: SongHolder, position: Int) {
        val song: Song = presenter.getItem(position)

        holder.viewBinding.tvName.text = song.name
        holder.viewBinding.tvArtist.text = song.author
        holder.viewBinding.tvDuration.text = TimeUtil.timeMillisToTime(song.duration)
    }
}