package com.example.activityessentials

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityB : AppCompatActivity() {

    lateinit var msgText : TextView
    lateinit var submitBtn : Button
    lateinit var cancelBtn : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)


        msgText=findViewById(R.id.enterMsgText)
        submitBtn=findViewById(R.id.submitBtn)
        cancelBtn=findViewById(R.id.cancelBtn)

        submitBtn.setOnClickListener{
            var message=msgText.text.toString()

            var intent = Intent()
            intent.putExtra("MESSAGE",message)

            setResult(Activity.RESULT_OK,intent)

            finish()
        }

        cancelBtn.setOnClickListener{
            cancelBtn.setOnClickListener{
                finish()
            }
        }

    }

}