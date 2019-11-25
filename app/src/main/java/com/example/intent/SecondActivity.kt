package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val message = intent.getStringArrayExtra(MainActivity.EXTRA_MSG)
        textViewMessage.text = String.format("%s %s",getString(R.string.message),message)

        buttonDone.setOnClickListener{
            finish()
        }
    }
}
