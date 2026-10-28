package com.mojalu75.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mojalu75.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.main)

    }
}