package com.example.trabajocurso.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trabajocurso.model.Datos


class MainViewModel: ViewModel() {
    val datos: LiveData<Datos> get() = _datos
    private var _datos = MutableLiveData<Datos>(Datos("", "", ""))


    fun comparar(texto1: String, texto2: String) {
        val resultadoComparacion: String
        if(texto1 == texto2){
            resultadoComparacion = "Los textos son iguales"
        }else{
            resultadoComparacion = "Los textos son distintos"
        }
        actualizarDatos(texto1, texto2, resultadoComparacion)
    }

    fun actualizarDatos(texto1: String, texto2: String, resultadoComparacion: String) {
        _datos.value = Datos(texto1, texto2, resultadoComparacion)
    }
}