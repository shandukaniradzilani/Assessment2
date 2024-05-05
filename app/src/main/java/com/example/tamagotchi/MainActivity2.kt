package com.example.tamagotchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val playbutton= findViewById<Button>(R.id.playbutton)
        val feedbutton= findViewById<Button>(R.id.feedbutton)
        val cleanbutton= findViewById<Button>(R.id.cleanbutton)
        val hungerystatus= findViewById<Button>(R.id.hungerystatus)
        val happystatus=findViewById<Button>(R.id.happystatus)
        val cleanstatus= findViewById<Button>(R.id.cleanstatus)
        val imageview2=findViewById<ImageView>(R.id.imageview2)

        playbutton.setOnClickListener {
            happystatus.text="100%"
            imageview2.setImageResource(R.drawable.happyimage)
        }

        feedbutton.setOnClickListener {
            hungerystatus.text="100%"
            imageview2.setImageResource(R.drawable.eatingimage)
        }

        cleanbutton.setOnClickListener {
            cleanstatus.text="100%"
            imageview2.setImageResource(R.drawable.cleaniimage)
        }


    }
}