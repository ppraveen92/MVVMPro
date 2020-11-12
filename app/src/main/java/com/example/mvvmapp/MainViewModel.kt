package com.example.mvvmapp

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var number : Int = 0

    fun increaseNumber()
    {
        number++
    }


    override fun onCleared() {
        super.onCleared()
    }
}