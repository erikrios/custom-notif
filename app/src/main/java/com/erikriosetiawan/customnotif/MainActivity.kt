package com.erikriosetiawan.customnotif

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erikriosetiawan.customnotif.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonShowNotification.setOnClickListener {
            startService(Intent(this, NotificationService::class.java))
        }
    }
}