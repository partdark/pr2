package com.example.pr2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)
        val imageButton : ImageButton = findViewById(R.id.imageButton)
        val editText : EditText = findViewById(R.id.editTextTextPersonName)
        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = getString(R.string.name_after_click)
            }
            else {
            textView.text = "" + editText.text
        }
        }
    }
}