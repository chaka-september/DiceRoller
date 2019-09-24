package com.chakaseptember.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var resultImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultImage = findViewById(R.id.dice_imageView)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        resultImage.setImageResource(drawableResource)
    }

}
