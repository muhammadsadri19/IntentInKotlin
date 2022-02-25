package com.muhammadsadri.intentinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammadsadri.intentinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnLogin.setOnClickListener{
            val userName = binding.edtuserName.text.toString()
            val mail = binding.edtemail.text.toString()
            val nomor = binding.edtnumberPhone.text.toString()

            val intent = Intent(this@MainActivity, HalamanAkun::class.java).apply{
                putExtra("userName", userName)
                putExtra("mail", mail)
                putExtra("nomor", nomor)
            }
            startActivity(intent)
        }
    }
}