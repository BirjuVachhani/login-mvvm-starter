package com.example.loginmvvm.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.loginmvvm.BR

abstract class BaseActivity<VM : BaseVM, VDB : ViewDataBinding>(@LayoutRes private val layoutID: Int) :
    AppCompatActivity() {

    abstract val viewModel: VM
    protected lateinit var binding: VDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutID)
        binding.lifecycleOwner = this
        binding.setVariable(BR.viewModel, viewModel)
    }
}







