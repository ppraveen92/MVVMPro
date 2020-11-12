package com.example.mvvmapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmapp.R
import com.example.mvvmapp.viewmodel.LiveDataViewModel
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
        viewModelLive.setLiveCount.value = 20000
        viewModelLive.setTimer()
        viewModelLive.getLiveData().observe(this, Observer {
            txtLive.text=it.toString()
        })

        viewModelLive.getFinish().observe(this, Observer {

            Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
        })


    }
}