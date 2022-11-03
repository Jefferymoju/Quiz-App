package com.snacked.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Nigeria", "Sweden",
            "Denmark","Argentina",
            4
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Lisbon", "Australia",
            "Zambia","Wales",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "USA", "Ghana",
            "Belgium","Austria",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Uruguay", "Brazil",
            "Peru","Malta",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Finland", "Sweden",
            "Denmark","Scotland",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Guatemala", "Hawaii",
            "Cuba","Fiji",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Hungary",
            "South Africa","Argentina",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Japan", "India",
            "China","South Korea",
            2
        )
        questionsList.add(que8)

        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Tampa", "Sweden",
            "Portugal","Kuwait",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Nigeria", "Sweden",
            "New Zealand","Portugal",
            3
        )
        questionsList.add(que10)

        return questionsList
    }


}