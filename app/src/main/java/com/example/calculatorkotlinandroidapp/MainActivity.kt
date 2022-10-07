package com.example.calculatorkotlinandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun numberActon(view: View) {}
    fun operationAction(view: View) {}
    fun allClearAction(view: View) {

    }
    fun backSpaceAction(view: View) {
    }
    fun equalsAction(view: View) {}
}