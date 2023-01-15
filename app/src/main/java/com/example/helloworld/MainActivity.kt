package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hello button
       val helloButton= findViewById<Button>(R.id.hellobutton);
        //button to display custom message in toast
        val customMsgButton =  findViewById<Button>(R.id.customMessageButton)



        helloButton.setOnClickListener {
            Log.v("onclicklistener","button was clicked!")

            Toast.makeText(this,"Hello visitor! Hope you like the app",Toast.LENGTH_LONG).show()
        }
        customMsgButton.setOnClickListener{
            val inputText =  findViewById<EditText>(R.id.customMessageTextField).text
            if(inputText.isBlank()){
                Toast.makeText(this,"Hey you should write something first!",Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,inputText,Toast.LENGTH_LONG).show()

            }
        }
    }
}