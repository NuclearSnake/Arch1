package com.neoproduction.arch1

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

class ServerManager : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun connect() {
        Timber.d("Connected to server!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun disconnect() {
        Timber.d("Disconnected from server!")
    }
}