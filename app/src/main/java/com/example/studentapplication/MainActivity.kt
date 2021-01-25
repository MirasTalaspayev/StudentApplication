package com.example.studentapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.studentapplication.rv_example.SecondActivity
import com.example.studentapplication.rv_example.Student
import org.w3c.dom.Text

public var listofstudents = arrayListOf<Student>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Size: Int = 0
        if (listofstudents.isNotEmpty()) {
            Size = listofstudents.size
        }
        val textView = findViewById<TextView>(R.id.number_of_students)
        textView.text = Size.toString()

        // Input
        val studentName = findViewById<EditText>(R.id.name).text.toString()
        val studentSurname = findViewById<EditText>(R.id.surname).text.toString()

        // Button: Submit
        findViewById<Button>(R.id.submit_student).setOnClickListener() {
            var student = Student(studentName, studentSurname)
            listofstudents.add(student)

        }
        findViewById<Button>(R.id.student_list_activity).setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}