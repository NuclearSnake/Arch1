package com.neoproduction.arch1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var serverManager: ServerManager
    private val vm: MainModel by lazy {
        ViewModelProviders.of(this).get(MainModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        serverManager = ServerManager()

        lifecycle.addObserver(serverManager)
        observe(vm.getMessage(), ::onMessageChange)

        tvText.setOnClickListener {
            vm.onClick()
        }
    }

    fun onMessageChange(newMessage: String) {
        tvText.text = newMessage
    }
}