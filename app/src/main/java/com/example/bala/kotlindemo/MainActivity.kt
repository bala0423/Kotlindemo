package com.example.bala.kotlindemo

import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener{
            Log.i("MainActivity","button is clicked")
            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }
        nxtbutton.setOnClickListener {

            val message : String = ettext.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Secondactivity::class.java)
            startActivity(intent)


        }


    }
}
