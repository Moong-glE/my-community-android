package com.moonggle.mycommunity.ui.login

import android.os.Bundle
import com.moonggle.mycommunity.R
import com.moonggle.mycommunity.base.MvvmActivity
import com.moonggle.mycommunity.databinding.ActivityLoginBinding

class LoginActivity : MvvmActivity() {
    private val binding: ActivityLoginBinding by binding(R.layout.activity_login)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            lifecycleOwner = this@LoginActivity
        }
    }
}