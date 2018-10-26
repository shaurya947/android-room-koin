package com.example.tsd043.roomwordsample.viewmodels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import com.example.tsd043.roomwordsample.data.WordRepository

class WordViewModelFactory (private val repository: WordRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WordViewModel(repository) as T
    }
}