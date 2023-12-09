package com.example.kittisapplication.viewmodels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kittisapplication.R
import com.example.kittisapplication.viewmodels.Constants
import com.example.kittisapplication.viewmodels.MainActivity


class ResultActivity : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvScore: TextView
    private lateinit var bttnFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvName = findViewById(R.id.tvName)
        tvScore = findViewById(R.id.tvScore)
        bttnFinish = findViewById(R.id.bttnFinish)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tvName.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvScore.text = "Your score is $correctAnswer out of $totalQuestions"

        bttnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}