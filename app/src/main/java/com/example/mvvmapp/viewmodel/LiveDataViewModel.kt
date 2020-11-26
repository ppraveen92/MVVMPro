package com.example.mvvmapp.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {
    private lateinit var timer: CountDownTimer
    var countLiveData = MutableLiveData<Int>()
    var finishLivedata = MutableLiveData<String>()
    var setLiveCount = MutableLiveData<Long>()
    fun getLiveData(): MutableLiveData<Int> {
        return countLiveData
    }

    fun getFinish(): LiveData<String> {
        return finishLivedata
    }

    fun setTimer() {
        timer = object : CountDownTimer(setLiveCount.value!!, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val time = millisUntilFinished / 1000
                countLiveData.value = time.toInt()
            }

            override fun onFinish() {
                finishLivedata.value = "done"
            }
        }.start()
    }
}