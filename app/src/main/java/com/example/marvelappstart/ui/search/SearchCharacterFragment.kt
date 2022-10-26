package com.example.marvelappstart.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelappstart.databinding.FragmentSearchCharacterBinding
import com.example.marvelappstart.ui.base.BaseFragment

class SearchCharacterFragment : BaseFragment<FragmentSearchCharacterBinding, SearchCharacterViewModel>() {

    override val viewModel: SearchCharacterViewModel by viewModels()


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchCharacterBinding = FragmentSearchCharacterBinding.inflate(inflater,container,false)
}