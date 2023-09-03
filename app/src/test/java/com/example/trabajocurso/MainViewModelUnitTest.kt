package com.example.trabajocurso

import com.example.trabajocurso.view.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before


class MainViewModelUnitTest {

    private lateinit var mainViewModel: MainViewModel

    @Before
    fun setup() {
        mainViewModel = MainViewModel()
    }

    @Test
    fun mainViewModel_ValoresIniciales(){
        val texto1: String = mainViewModel.datos.value?.texto1.toString()
        val texto2: String = mainViewModel.datos.value?.texto2.toString()
        assertEquals("", texto1)
        assertEquals("", texto2)
    }
}