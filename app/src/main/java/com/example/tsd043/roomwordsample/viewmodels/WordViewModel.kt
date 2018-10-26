package com.example.tsd043.roomwordsample.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.tsd043.roomwordsample.data.Word
import com.example.tsd043.roomwordsample.data.WordRepository

class WordViewModel(private val repository: WordRepository) : ViewModel() {
    val allWords: LiveData<List<Word>> = repository.getAllWords()

    fun insert(word: Word) {
        repository.insert(word)
    }
}