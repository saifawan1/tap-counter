package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 80
    var count = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)
        val textView = findViewById<TextView>(R.id.textView)
        button1.setOnClickListener{
            counter+=count
            textView.text = counter.toString()
            if(counter == 100){
                upgradeBtn.visibility = View.VISIBLE
            }
        }
        upgradeBtn.setOnClickListener{
            count = 2
            button1.text = "Add 2"
            upgradeBtn.visibility = View.INVISIBLE
        }
    }
}