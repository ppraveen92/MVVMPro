package com.example.mvvmapp

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel()
{
    private lateinit var timer:CountDownTimer
    var countLiveData = MutableLiveData<Int>()
    var finishLivedata = MutableLiveData<String>()

    fun getLiveData():MutableLiveData<Int>
    {
        return countLiveData
    }

    fun getFinish():LiveData<String>
    {
        return finishLivedata
    }


    fun setTimer()
    {
        timer = object :CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                val time = millisUntilFinished/1000
                countLiveData.value=time.toInt()
            }

            override fun onFinish() {
                finishLivedata.value = "done"
            }

        }.start()
    }
}