package com.example.twotwo_lkolehiyo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_socials_page)

        // Set click listeners for the buttons
        val facebookButton
        facebookButton.setOnClickListener {
            openSocialMediaLink("https://www.facebook.com/letrancollegedepartment")
        }

        val youtubeButton
        youtubeButton.setOnClickListener {
            openSocialMediaLink("https://www.youtube.com/@LM1947Gofurther")
        }

        val websiteButton
        websiteButton.setOnClickListener {
            openSocialMediaLink("https://www.letran-manaoag.edu.ph/")
        }
    }

    private fun openSocialMediaLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
