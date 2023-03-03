package com.example.erkinbekovbilimdz_6_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.erkinbekovbilimdz_6_3.databinding.FragmentSongInfoBinding

class SongInfoFragment : Fragment() {

    private lateinit var binding: FragmentSongInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongInfoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        receiving()
    }
    private fun receiving() {
        if (arguments != null){
            val song = arguments?.getString("Key_for_song")
            binding.tvResult.text = song
        }
    }
}