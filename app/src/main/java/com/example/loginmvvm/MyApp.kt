package com.example.loginmvvm

import android.app.Application
import com.example.loginmvvm.login.di.coreModule
import com.example.loginmvvm.login.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)

            modules(listOf(coreModule, vmModule))
        }
    }
}