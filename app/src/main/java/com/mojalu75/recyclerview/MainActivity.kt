package com.mojalu75.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mojalu75.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.main)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Bocatas>()
        data.add(Bocatas(R.drawable.bocata1, "Bocadillo de jamón", "4.50"))
        data.add(Bocatas(R.drawable.bocata2, "Bocadillo de queso", "3.50"))
        data.add(Bocatas(R.drawable.bocata3, "Bocadillo de tortilla", "5.00"))
        data.add(Bocatas(R.drawable.bocata4, "Bocadillo de albondigas", "4.00"))
        data.add(Bocatas(R.drawable.bocata5, "Bocadillo de Jamon york", "3.50"))
        data.add(Bocatas(R.drawable.bocata6, "Bocadillo de albondigas", "8.00"))

        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(data)

        // Setting the Adapter with the recyclerview
        binding.recyclerView.adapter = adapter
    }
}