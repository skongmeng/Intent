package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSend.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage() {
        if(editTextMessage.text.isEmpty()){
            editTextMessage.setError("Value required")
            return
        }
        val intent = Intent(this,SecondActivity::class.java)
        val message = editTextMessage.text.toString()
        intent.putExtra(EXTRA_MSG,message)
        startActivity(intent)
    }


    companion object{
        const val EXTRA_MSG = "com.example.intent.EXTRA_MSG"

    }

}
