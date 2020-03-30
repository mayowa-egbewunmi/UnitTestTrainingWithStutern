package com.mayowa.android.unittesttrainingwithstutern

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onResume() {
        super.onResume()
        findViewById<EditText>(R.id.text).setText(R.string.activity_resumed)
    }

    companion object {
        fun getActivityIntent(context: Context) = Intent(context, SecondActivity::class.java)
    }
}
