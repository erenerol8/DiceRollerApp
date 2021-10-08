package com.eren.dicerollerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eren.dicerollerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val diceLeftRandom = (1..6).random()
            val diceRightRandom = (1..6).random()
            when (diceLeftRandom) {
                1 -> binding.imageView.setImageResource(R.drawable.dice_1)
                2 -> binding.imageView.setImageResource(R.drawable.dice_2)
                3 -> binding.imageView.setImageResource(R.drawable.dice_3)
                4 -> binding.imageView.setImageResource(R.drawable.dice_4)
                5 -> binding.imageView.setImageResource(R.drawable.dice_5)
                else -> {
                    binding.imageView.setImageResource(R.drawable.dice_6)
                }
            }
            when (diceRightRandom) {
                1 -> binding.imageView2.setImageResource(R.drawable.dice_1)
                2 -> binding.imageView2.setImageResource(R.drawable.dice_2)
                3 -> binding.imageView2.setImageResource(R.drawable.dice_3)
                4 -> binding.imageView2.setImageResource(R.drawable.dice_4)
                5 -> binding.imageView2.setImageResource(R.drawable.dice_5)
                else -> {
                    binding.imageView2.setImageResource(R.drawable.dice_6)
                }
            }
            binding.textView.text = ("Zarlar: $diceLeftRandom ve $diceRightRandom")
        }
    }
}