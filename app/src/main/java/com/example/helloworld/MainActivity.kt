package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() { // MainActivity -> AppCompatActivity -> Activity

    //액티비티 클래스가 처음 생성될 때 가장 먼저 실행되는 콜백
    override fun onCreate(savedInstanceState: Bundle?) { //bundle에는 저장 된 내용이 옴, 보통 null로 들어오게 됨
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) //보여줄 레이아웃 지정함
        setContentView(R.layout.edit_text)
        //settingBtn()
    }

    fun settingBtn() {
        val button = findViewById<Button>(R.id.button) //메인 액티비티의 버튼 아이디
        button.setOnClickListener {
            //클릭 후 서브 액티비티로 이동
            //intent 사용
            val intent = Intent(this,SubActivity::class.java) //서브액티비티로 가는 인텐트 생성
            startActivity(intent) //실행
        }
    }

}