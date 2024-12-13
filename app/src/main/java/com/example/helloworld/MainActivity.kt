package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { // MainActivity -> AppCompatActivity -> Activity

    //액티비티 클래스가 처음 생성될 때 가장 먼저 실행되는 콜백
    override fun onCreate(savedInstanceState: Bundle?) { //bundle에는 저장 된 내용이 옴, 보통 null로 들어오게 됨
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //보여줄 레이아웃 지정함
    }

}