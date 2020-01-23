package com.neoproduction.arch1

import android.app.Application
import android.util.Log
import timber.log.Timber


class ApplicationArch1 : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }
}

class CrashReportingTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }

        // log crash with some crash reporting lib

//        if (t != null) {
//            when (priority) {
//                Log.ERROR -> // report error
//                Log.WARN -> // report warning
//            }
//        }
    }
}