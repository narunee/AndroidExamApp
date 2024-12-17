package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)
        settingBtns()
    }
    fun settingBtns(){
        val button_red = findViewById<Button>(R.id.button_red)
        val button_blue = findViewById<Button>(R.id.button_blue)

        button_red.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction() //fragment를 가지고 여러 행동을 할 수 있게 함
            fragmentTransaction.replace(R.id.frame_layout,RedFragment())
            fragmentTransaction.commit()
        }

        button_blue.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction() //fragment를 가지고 여러 행동을 할 수 있게 함
            fragmentTransaction.replace(R.id.frame_layout,BlueFragment())
            fragmentTransaction.commit()
        }
    }
}