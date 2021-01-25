package com.example.studentapplication.rv_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.studentapplication.MainActivity
import com.example.studentapplication.R
import com.example.studentapplication.listofstudents


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val rv = findViewById<RecyclerView>(R.id.rv)
        val adapter = StudentAdapter(listofstudents)
        rv.adapter = adapter

        findViewById<Button>(R.id.BackToMain).setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}