package com.example.layouts1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.layouts1.databinding.ActivityMainBinding

private val user: User = User("Matti", 1990)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.currentUser = user

        binding.changeUserButton.setOnClickListener {
            val name = binding.userPlaceHolderInput.text
            user.name = name.toString()
            binding.invalidateAll()
        }
        val saveButton = findViewById<Button>(R.id.saveButton)
        saveButton.setOnClickListener {
            val sport = findViewById<EditText>(R.id.yourSportInput).text.toString()
            val distance = findViewById<EditText>(R.id.distanceInput).text.toString()
            val duration = findViewById<EditText>(R.id.durationInput).text.toString()
            val date = findViewById<EditText>(R.id.dateInput).text.toString()
            Log.d("MainActivity","Sport=$sport, Distance=$distance, Duration=$duration, Date=$date")
        }
    }
}