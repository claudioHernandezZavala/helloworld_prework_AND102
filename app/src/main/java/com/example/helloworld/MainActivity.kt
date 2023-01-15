package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val button= findViewById<Button>(R.id.hellobutton)
        button.setOnClickListener {
            Log.v("onclicklistener","button was clicked!")
            Toast.makeText(this,"Hello visitor! Hope you like the app",Toast.LENGTH_LONG).show()
        }
    }
}