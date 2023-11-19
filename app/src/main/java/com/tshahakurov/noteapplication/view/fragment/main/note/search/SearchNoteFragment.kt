package com.tshahakurov.noteapplication.view.fragment.main.note.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tshahakurov.noteapplication.databinding.FragmentSearchNoteBinding
import dagger.hilt.android.AndroidEntryPoint


class SearchNoteFragment : Fragment() {

    private var _binding: FragmentSearchNoteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}