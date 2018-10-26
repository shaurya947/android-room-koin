package com.example.tsd043.roomwordsample.modules

import com.example.tsd043.roomwordsample.data.WordRoomDatabase
import org.koin.dsl.module.module

val dataModule = module {
    single { WordRoomDatabase.getDatabase(get()).wordDao() }
}