package com.example.tsd043.roomwordsample.modules

import com.example.tsd043.roomwordsample.data.WordRepository
import org.koin.dsl.module.module

val repositoryModule = module {
    single { WordRepository.get(get()) }
}