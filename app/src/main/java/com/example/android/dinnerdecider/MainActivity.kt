package com.example.android.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist =  arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedfoodTxt.text = "BurgerKing"
        decideBtn.setOnClickListener {
            val random = Random
            val randomFood = random.nextInt(foodlist.count())
            selectedfoodTxt.text = foodlist[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodlist.add(newFood)
            addFoodTxt.text.clear()
            println(foodlist)
        }
    }
}
