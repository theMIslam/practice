package com.london.instagram_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.london.instagram_clone.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_sign_up)
        setContentView(binding.root)
    }
}