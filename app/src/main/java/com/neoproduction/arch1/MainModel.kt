package com.neoproduction.arch1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainModel : ViewModel() {
    private var clickedNumber = 0
    private val message = MutableLiveData<String>().apply {
        value = "Welcome!"
    }

    fun getMessage(): LiveData<String> = message

    fun onClick() {
        clickedNumber++
        updateMessage()
    }

    // ---------------- PRIVATE METHODS ----------------

    private fun updateMessage() {
        message.value = "Clicked $clickedNumber times"
    }
}