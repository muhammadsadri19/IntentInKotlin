package com.muhammadsadri.intentinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muhammadsadri.intentinkotlin.databinding.ActivityHalamanAkunBinding

class HalamanAkun : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanAkunBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanAkunBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("userName")){
            val name = intent.getStringExtra("userName")
            val email = intent.getStringExtra("mail")
            val phoneNumber = intent.getStringExtra("nomor")

            binding.tvName.text = name.toString()
            binding.tvEmail.text = email.toString()
            binding.tvPhone.text = phoneNumber.toString()
        }
    }
}