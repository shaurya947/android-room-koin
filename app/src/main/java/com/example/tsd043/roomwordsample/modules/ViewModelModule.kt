package com.example.tsd043.roomwordsample.modules

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import com.example.tsd043.roomwordsample.viewmodels.WordViewModel
import com.example.tsd043.roomwordsample.viewmodels.WordViewModelFactory
import org.koin.dsl.module.module

val viewModelModule = module {
    single { WordViewModelFactory(get()) as ViewModelProvider.Factory }
    factory { (activity: FragmentActivity) -> ViewModelProviders.of(activity, get()).get(WordViewModel::class.java) }
}