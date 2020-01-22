package com.neoproduction.arch1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
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
        vm.getMessage().observe(this, Observer<String> {
            tvText.text = it
        })
        tvText.setOnClickListener {
            vm.onClick()
        }
    }
}