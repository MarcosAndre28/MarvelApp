package com.example.marvelappstart.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelappstart.databinding.FragmentFavoriteCharacterBinding
import com.example.marvelappstart.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteCharacterFragment : BaseFragment<FragmentFavoriteCharacterBinding, FavoriteCharacterViewModel>() {

    override val viewModel: FavoriteCharacterViewModel by viewModels()


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFavoriteCharacterBinding = FragmentFavoriteCharacterBinding.inflate(inflater,container,false)

}