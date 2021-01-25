package com.example.studentapplication.rv_example

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.studentapplication.R

class StudentAdapter (private val dataSet: ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = dataSet[position].Name + " " + dataSet[position].Surname
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}