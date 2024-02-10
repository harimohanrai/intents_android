package com.example.intents_sis2125_feb10

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnbio= findViewById<Button>(R.id.button1)
        val btnprofile= findViewById<Button>(R.id.button2)
        val btncam= findViewById<Button>(R.id.button3)

        btnbio.setOnClickListener {
            intent= Intent(applicationContext, Second_Screen::class.java)
            startActivity(intent)
        }
        btnprofile.setOnClickListener {
            val web= Intent(Intent.ACTION_VIEW)
            web.data= Uri.parse("https://harimohanrai.wordpress.com/")
            startActivity(web)
        }
        btncam.setOnClickListener {
            val camera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera)
        }
    }
}