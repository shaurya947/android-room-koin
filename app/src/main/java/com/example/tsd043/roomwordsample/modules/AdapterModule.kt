package com.example.tsd043.roomwordsample.modules

import android.content.Context
import com.example.tsd043.roomwordsample.adapters.WordListAdapter
import org.koin.dsl.module.module

val adapterModule = module {
    factory { (context: Context) -> WordListAdapter(context) }
}