package com.example.androidbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityFragmentKt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_kt)
        setFagment()
    }

    fun setFagment(){
        val newFragment = FirstFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, newFragment)
        transaction.commit()
    }
}