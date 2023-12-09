package com.example.kittisapplication.viewmodels

import com.example.kittisapplication.R

object Constants{


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        //1
        val que1 = Question(
            1, "What car brand do you see in the picture?",
            R.drawable.hyundai,
             "Hyundai",
            "BMW",
            "Skoda",
            "Ford",
            1
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2, "What car brand do you see in the picture?",
            R.drawable.mazda,
            "Mazda",
            "Audi",
            "Skoda",
            "Ford",
            1
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3, "What car brand do you see in the picture?",
            R.drawable.mercedes,
            "Audi",
            "Mercedes",
            "Skoda",
            "Renault",
            2
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "What car brand do you see in the picture?",
            R.drawable.subaru,
            "Audi",
            "BMW",
            "Subaru",
            "Volkswagen",
            3
        )
        questionList.add(que4)
        //5
        val que5 = Question(
            5, "What car brand do you see in the picture?",
            R.drawable.toyota,
            "Opel",
            "Toyota",
            "Skoda",
            "Ford",
            2
        )
        questionList.add(que5)
        //6
        val que6 = Question(
            6, "What car brand do you see in the picture?",
            R.drawable.vw,
            "Audi",
            "Seat",
            "Skoda",
            "Volkswagen",
            4
        )
        questionList.add(que6)

        return questionList
    }
}