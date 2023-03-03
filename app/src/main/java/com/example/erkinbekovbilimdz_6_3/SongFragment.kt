package com.example.erkinbekovbilimdz_6_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.erkinbekovbilimdz_6_3.databinding.FragmentSongBinding

class SongFragment : Fragment() {

    private lateinit var binding: FragmentSongBinding
    private var songList = ArrayList<Song>()
    private lateinit var adapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        adapter = SongAdapter(songList, this::onClick)
        binding.rvSong.adapter = adapter

    }

    private fun loadData() {
        songList.apply {
            add(Song("1", "Counting Stars", "OneRepublic", "4:44"))
            add(Song("2", "Sunflower", "Post Malone, Swae Lee", "2:42"))
            add(Song("3", "Shape You", "Ed Sheeran", "4:24"))
            add(Song("4", "I Need A Dollar", "Aloe Blacc", "4:03"))
            add(Song("5", "World's Smallest Violin", "AJR", "3:08"))
            add(Song("6", "feels like", "JVKE", "2:35"))
            add(Song("7", "airplane thoughts", "dhruv", "3:30"))
            add(Song("8", "Bones", "Imagine Dragons", "2:45"))
            add(Song("9", "Green Lights", "Aloe Blacc", "2:54"))
            add(Song("10", "Can You Do This", "Aloe Blacc", "2:56"))
        }
    }
    private fun onClick(position: String){
        val bundle = Bundle()
        bundle.putString("Key_for_song", position)
        val songInfoFragment = SongInfoFragment()
        songInfoFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_song, songInfoFragment).addToBackStack(null).commit()
    }
}