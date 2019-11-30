package com.example.loginmvvm.login

import android.os.Bundle
import com.example.loginmvvm.R
import com.example.loginmvvm.base.BaseActivity
import com.example.loginmvvm.login.viewmodel.MainActivityVM
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<MainActivityVM>(R.layout.activity_main) {

    override val viewModel: MainActivityVM by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
