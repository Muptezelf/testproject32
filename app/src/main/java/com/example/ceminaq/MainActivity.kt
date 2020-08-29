package com.example.ceminaq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main. activity_main.*
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button) as Button
        val text = findViewById<TextView>(R.id.text) as TextView
        text.setText("oguzunamk")


        button.setOnClickListener {
            text.setText("yarak")
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)





        }




    }
}

abstract class Screen {


}
