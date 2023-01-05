package com.example.kotlintextviewedittext

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s_button:Button=findViewById(R.id.button)
        val input:EditText=findViewById(R.id.editTextTextPersonName)
        val displaytext:TextView=findViewById(R.id.textView2)
        val r_button:Button=findViewById(R.id.button2)
        s_button.setOnClickListener {
            val inputvalue:String=input.text.toString()
            Toast.makeText(applicationContext,"${inputvalue}",Toast.LENGTH_SHORT).show()
            displaytext.text=inputvalue


        }
        r_button.setOnClickListener{
            if(displaytext.text.trim()==""){
                Toast.makeText(applicationContext,"No Input Value to Erase",Toast.LENGTH_SHORT).show()
            }else{
                displaytext.text = ""
            }

        }
    }
}