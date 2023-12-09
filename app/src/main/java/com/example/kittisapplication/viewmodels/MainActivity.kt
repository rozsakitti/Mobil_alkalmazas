package com.example.kittisapplication.viewmodels

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.kittisapplication.viewmodels.QuizQuestionsActivity
import com.example.kittisapplication.R
import com.example.kittisapplication.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.tvAppName.text = "QuizApp"


        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
