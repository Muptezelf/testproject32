package com.example.ceminaq

import android.content.Intent
import android.content.SharedPreferences
import android.nfc.NfcAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class MainActivity2 : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        sharedPreferences = this.getSharedPreferences("com.example.ceminaq", MODE_PRIVATE)

        val button = findViewById<Button>(R.id.button2) as Button
        val list = findViewById<ListView>(R.id.list_view) as ListView
        val dev = ArrayList<String>()
        dev.add("Android")
        dev.add("Developer")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dev)
        list.adapter = adapter
       //val sa = sharedPreferences.getInt("sa", 1)
         // if(sa == 1){

              //val dev = ArrayList<String>()
              //dev.add("Android")
              //dev.add("Developer")
              //dev.removeAll(dev)



        //}






        button.setOnClickListener {

            sharedPreferences.edit().putString("sa", dev.toString()).apply()
            dev.removeAll(dev)
            Toast.makeText(applicationContext, "silme islemi tamamlandi", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


            list.adapter = adapter
        }
        }
    }
































