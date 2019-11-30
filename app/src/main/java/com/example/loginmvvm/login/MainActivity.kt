package com.example.loginmvvm.login

import android.os.Bundle
import android.view.View
import com.example.loginmvvm.R
import com.example.loginmvvm.base.BaseActivity
import com.example.loginmvvm.databinding.MainActivityBinding
import com.example.loginmvvm.login.viewmodel.MainActivityVM
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<MainActivityVM, MainActivityBinding>(R.layout.activity_main) {

    override val viewModel: MainActivityVM by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun onLoginButtonPressed(v: View) {
        val email = viewModel.emailLiveData.value.toString()
        val password = viewModel.passwordLiveData.value.toString()
        viewModel.login(email, password)
    }

}
