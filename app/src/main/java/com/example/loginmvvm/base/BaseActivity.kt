package com.example.loginmvvm.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

abstract class BaseActivity<VM : ViewModel>(@LayoutRes private val layoutID: Int) :
    AppCompatActivity() {

    abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutID)
    }
}