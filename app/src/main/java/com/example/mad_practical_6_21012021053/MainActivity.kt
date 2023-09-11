package com.example.mad_practical_6_21012021053

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playbutton = findViewById<FloatingActionButton>(R.id.playbtn)
        val stopbutton = findViewById<FloatingActionButton>(R.id.stopbtn)
        playbutton.setOnClickListener {
            play()
        }

        stopbutton.setOnClickListener {
            stop()
        }
    }
    fun play(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) }
    }
    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) }
    }
}