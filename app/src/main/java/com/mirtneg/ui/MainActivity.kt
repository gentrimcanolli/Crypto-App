package com.mirtneg.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mirtneg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var cryptoViewModel: CryptoViewModel
    lateinit var adapter: CryptoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        cryptoViewModel = ViewModelProvider(this)[CryptoViewModel::class.java]
        setContentView(binding.root)

        binding.cryptoRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = CryptoAdapter()
        binding.cryptoRecyclerView.adapter = adapter

        cryptoViewModel.getCryptoElements()

        cryptoViewModel.cryptoList.observe(this) {
            adapter.cryptoItem = it
        }

    }
}