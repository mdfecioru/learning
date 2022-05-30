package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Using view binding
        // Creating a binding object for the main_activity.xml layout
//        val binding = ActivityMainBinding.inflate(layoutInflater)
//        val rollButton: Button = binding.rollButton
//        rollButton.text = "Let Roll Baby!"
//        val view = binding.root
//        view.setVerticalGravity(android.view.Gravity.CENTER)
//        setContentView(view)

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        rollButton.text = "Let's Roll Baby!"
        rollButton.setOnClickListener{
            //Toast.makeText(this, "I clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        //val resultText: TextView = findViewById(R.id.result_text)
        // resultText.text = diceResult.toString()

        val diceResult = Random().nextInt(6) + 1
        val dice = when(diceResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(dice)
    }
}