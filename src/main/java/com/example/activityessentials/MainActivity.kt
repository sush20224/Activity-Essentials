package com.example.activityessentials

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var name : EditText?=null
    var logInBtn : Button?= null
    var userText : TextView ?=null
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity","MainActivity::onCreate()")
        setContentView(R.layout.activity_main)


        name=findViewById(R.id.enterName)
        logInBtn=findViewById(R.id.logInBtn)
        userText=findViewById(R.id.enterText)

       logInBtn?.setOnClickListener{
         userText?.setText(name?.getText())
           var intent= Intent(this,SecondActivity::class.java)
                   intent.putExtra("USER_TEXT",userText?.text.toString())
           startActivity(intent)
       }


    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","MainActivity::onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity","MainActivity::onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity","MainActivity::onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity","MainActivity::onStop()")
    }


}