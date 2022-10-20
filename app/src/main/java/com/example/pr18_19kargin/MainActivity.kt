package com.example.pr18_19kargin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var TextChapter : TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TextChapter = findViewById<TextView>(R.id.MainText)
    }
    fun ShowToast(text : String)
    {
        val message = Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
    fun onClick(view: View)
    {
        when(view.id)
        {
            R.id.row1 -> TextChapter.setText(R.string.chapter1)
            R.id.row2 -> TextChapter.setText(R.string.chapter2)
            R.id.row3 -> TextChapter.setText(R.string.chapter3)
            R.id.row4 -> TextChapter.setText(R.string.chapter4)
            R.id.row5 -> TextChapter.setText(R.string.chapter5)
            R.id.row6 -> TextChapter.setText(R.string.chapter6)
            R.id.row7 -> TextChapter.setText(R.string.chapter7)
            R.id.row8 -> TextChapter.setText(R.string.chapter8)
        }
    }
}