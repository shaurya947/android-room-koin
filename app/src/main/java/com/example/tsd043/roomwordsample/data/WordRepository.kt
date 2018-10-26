package com.example.tsd043.roomwordsample.data

import org.jetbrains.anko.doAsync

class WordRepository private constructor(private val wordDao: WordDao) {

    fun getAllWords() = wordDao.getAllWords()


    fun insert(word: Word) {
        doAsync {
            wordDao.insert(word)
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: WordRepository? = null

        fun get(wordDao: WordDao) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: WordRepository(wordDao).also { INSTANCE = it }
            }

    }
}