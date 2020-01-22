package com.neoproduction.arch1

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class ServerManager : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun connect() {
        Log.d("arch1_log", "Connected to server!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun disconnect() {
        Log.d("arch1_log", "Disconnected from server!")
    }
}