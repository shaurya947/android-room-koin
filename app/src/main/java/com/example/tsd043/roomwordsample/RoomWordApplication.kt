package com.example.tsd043.roomwordsample

import android.app.Application
import com.example.tsd043.roomwordsample.modules.adapterModule
import com.example.tsd043.roomwordsample.modules.dataModule
import com.example.tsd043.roomwordsample.modules.repositoryModule
import com.example.tsd043.roomwordsample.modules.viewModelModule
import org.koin.android.ext.android.startKoin

class RoomWordApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(adapterModule, viewModelModule, repositoryModule, dataModule))
    }
}