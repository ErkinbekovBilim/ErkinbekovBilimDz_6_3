package com.example.erkinbekovbilimdz_6_3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.erkinbekovbilimdz_6_3.databinding.ItemSongBinding

class SongAdapter(
    val songList: ArrayList<Song>,
    val onClick: (String) -> Unit

): Adapter<SongAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            return ViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun getItemCount(): Int {
            return songList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind()
        }

        inner class ViewHolder(private val binding: ItemSongBinding) :
            RecyclerView.ViewHolder(binding.root) {
            fun bind() {
                val song = songList[adapterPosition]

                binding.apply {
                    tvSong.text = song.songName
                    author.text = song.authorSong
                    minut.text = song.songMinute
                    tvNumber.text = song.songNumber
                }
                itemView.setOnClickListener {
                    onClick(songList[adapterPosition].songName)
                }
            }
        }
    }

