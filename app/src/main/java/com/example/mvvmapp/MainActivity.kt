package com.example.mvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      /*  var number : Int =0

        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java);

        txt.text=viewModel.number.toString()
        btn.setOnClickListener {
           *//* number++
            txt.text=number.toString()*//*

            viewModel.increaseNumber()
            txt.text=viewModel.number.toString()

        }*/


        val viewModelLive =ViewModelProviders.of(this).get(LiveDataViewModel::class.java)
        viewModelLive.setTimer()
        viewModelLive.getLiveData().observe(this, Observer {
            txtLive.text=it.toString()
        })


    }
}