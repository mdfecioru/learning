package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
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
        rollButton.text = "Let's Roll Baby!"
        rollButton.setOnClickListener{
            //Toast.makeText(this, "I clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val diceResult = Random().nextInt(6) + 1
        resultText.text = diceResult.toString()
    }
}