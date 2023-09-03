package com.example.trabajocurso.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.trabajocurso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.datos.observe(this) {
            binding.editText1.setText(it.texto1)
            binding.editText2.setText(it.texto2)
            binding.resultado.text = it.comparacion
        }

        binding.botonComparar.setOnClickListener{
            mainViewModel.comparar(binding.editText1.text.toString(), binding.editText2.text.toString())
        }
    }
}