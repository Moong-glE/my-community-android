package com.moonggle.mycommunity

import android.app.Application
import com.moonggle.mycommunity.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyCommunityApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyCommunityApp)
            modules(networkModule)
        }
    }
}