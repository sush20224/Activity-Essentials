package com.example.activityessentials

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogInActivity : AppCompatActivity() {

    var clickBtn : Button?= null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        clickBtn = findViewById(R.id.logInBtn)

        clickBtn?.setOnClickListener{
            var intent= Intent(this, MainActivity:: class.java)
            startActivity(intent)

        }
    }
}