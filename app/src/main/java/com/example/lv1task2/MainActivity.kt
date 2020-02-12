package com.example.lv1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


val answerColumn = listOf("T", "F", "F", "F")

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
