package com.example.loginmvvm.login.di

import com.example.loginmvvm.login.viewmodel.MainActivityVM
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module {
    viewModel {
        MainActivityVM()
    }
}