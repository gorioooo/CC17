package com.example.twotwo_lkolehiyo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        // Get references to views
        val usernameTextView = findViewById<TextView>(R.id.usernameTextView)
        val gradeSectionTextView = findViewById<TextView>(R.id.gradeSectionTextView)
        val strandTextView = findViewById<TextView>(R.id.strandTextView)
        val idNumberTextView = findViewById<TextView>(R.id.idNumberTextView)

        // Replace these placeholders with actual user data
        val username = "John Doe"
        val gradeSection = "Grade 10, Section A"
        val strand = "Science and Technology"
        val idNumber = "ID: 123456"
        R.drawable.user_profile_image // You can replace this with the user's actual image URL

        // Set user data to views
        usernameTextView.text = username
        gradeSectionTextView.text = gradeSection
        strandTextView.text = strand
        idNumberTextView.text = idNumber
    }
}
