package com.example.lv1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


val answerColumn = listOf("T", "F", "F", "F")

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener{
            checkAnswers()
        }
    }

    fun checkAnswers()
    {
        var correctAnswers = 0
        if(answer.text.toString() == answerColumn[0]) {
            correctAnswers ++
        }
        if(answer1.text.toString() == answerColumn[1]) {
            correctAnswers ++
        }
        if(answer2.text.toString() == answerColumn[2]) {
            correctAnswers ++
        }
        if(answer3.text.toString() == answerColumn[3]) {
            correctAnswers ++
        }

        Toast.makeText(this, getString(R.string.correct_answers, correctAnswers), Toast.LENGTH_SHORT).show()
    }
}

