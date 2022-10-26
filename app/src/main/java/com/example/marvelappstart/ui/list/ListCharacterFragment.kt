package com.example.marvelappstart.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelappstart.databinding.FragmentListCharacterBinding
import com.example.marvelappstart.ui.base.BaseFragment

class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding,ListCharcterViewModel>(){

    override val viewModel: ListCharcterViewModel by viewModels()


    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding = FragmentListCharacterBinding.inflate(inflater,container,false)


}