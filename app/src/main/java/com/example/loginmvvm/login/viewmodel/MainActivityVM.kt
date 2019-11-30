package com.example.loginmvvm.login.viewmodel

import android.util.Patterns
import androidx.lifecycle.MutableLiveData
import com.example.loginmvvm.base.BaseVM

class MainActivityVM : BaseVM() {

    val emailLiveData = MutableLiveData<String>("")
    val passwordLiveData = MutableLiveData<String>("")

    val pattern = Patterns.EMAIL_ADDRESS

    fun login() {
        val email = emailLiveData.value!!
        val password = passwordLiveData.value!!

        // validation
        if (email.isBlank() || !pattern.matcher(email).matches()) {
            // invalid email
            return
        }
        if (password.isBlank() || password.length !in 8..20) {
            // invalid password
            return
        }

        // proceed for login
    }
}