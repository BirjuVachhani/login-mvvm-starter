package com.example.loginmvvm.login.viewmodel

import android.util.Patterns
import androidx.lifecycle.MutableLiveData
import com.example.loginmvvm.base.BaseVM
import com.example.loginmvvm.utils.Constants

class MainActivityVM : BaseVM() {

    val emailLiveData = MutableLiveData<String>("")
    val passwordLiveData = MutableLiveData<String>("")

    val pattern = Patterns.EMAIL_ADDRESS

    fun login(email: String, password: String) {

        // validation
        if (email.isBlank() || !pattern.matcher(email).matches()) {
            // invalid email
            return
        }
        if (password.isBlank() || password.length !in Constants.PASSWORD_RANGE) {
            // invalid password
            return
        }

        // proceed for login
    }
}