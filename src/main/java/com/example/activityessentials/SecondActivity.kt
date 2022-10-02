package com.example.activityessentials

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var  backBtn : Button
    lateinit var userMsg: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        backBtn=findViewById(R.id.backBtn)
        userMsg=findViewById(R.id.userMsgTextView)


        backBtn.setOnClickListener{
            finish()
        }

        //get access to the launching intent in this activity
        var launchingIntent=this.intent

        //get access to extras with launching activity
        var msgFromMainActivity=launchingIntent.getStringExtra("USER_TEXT")

        //changing userMessage
        userMsg.text=msgFromMainActivity
    }
}