package com.example.activityessentials

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityA : AppCompatActivity() {

    lateinit var getMsgBtn : Button
    lateinit var msg : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)

        getMsgBtn=findViewById(R.id.getMsgBtn)
        msg=findViewById(R.id.msgTextView)

        getMsgBtn.setOnClickListener{
            var intent = Intent(this@ActivityA, ActivityB::class.java)
            startActivityForResult(intent,101)
        }


}
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
            if(requestCode==101 && resultCode== Activity.RESULT_OK && data!=null){
                var message=data.extras?.getString("MESSAGE")
                msg.text=message

            }
        }
    }

