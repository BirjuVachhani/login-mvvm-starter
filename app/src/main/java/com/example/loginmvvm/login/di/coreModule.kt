package com.example.loginmvvm.login.di

import android.content.Context
import com.example.loginmvvm.utils.Constants
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val coreModule = module {
    single {
        androidContext().getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE)
    }
}