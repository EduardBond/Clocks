package com.example.chasi

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MenuActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun mainmenu(view: android.view.View) {
        //intent = Intent(this, MainActivity::class.java)
       // startActivity(intent)
        Toast.makeText(this,"sucess",Toast.LENGTH_SHORT).show()
    }
}