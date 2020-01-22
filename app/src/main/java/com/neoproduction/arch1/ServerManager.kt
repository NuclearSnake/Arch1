package com.neoproduction.arch1

import android.util.Log

class ServerManager {
    fun connect() {
        Log.d("arch1_log", "Connected to server!")
    }

    fun disconnect() {
        Log.d("arch1_log", "Disconnected from server!")
    }
}