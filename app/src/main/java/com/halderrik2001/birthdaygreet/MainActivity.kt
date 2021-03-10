package com.halderrik2001.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name= editTextTextPersonName.editableText.toString()
        Toast.makeText(this, "Name is $name ", Toast.LENGTH_LONG).show()
        val intent=Intent(this, Birthdaygreetingactivity ::class.java)
        intent.putExtra(Birthdaygreetingactivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}