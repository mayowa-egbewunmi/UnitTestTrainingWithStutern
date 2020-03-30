package com.mayowa.android.unittesttrainingwithstutern

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.hello_button).setOnClickListener {
            startActivity(SecondActivity.getActivityIntent(this))
        }
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, R.string.pause_toast_message, Toast.LENGTH_LONG).show()
    }
}
