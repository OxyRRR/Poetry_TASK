package com.example.poetry_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity<View> : AppCompatActivity() {

    private var logTag = "MY LOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(logTag, "A hurricane arises, Tosses the plane into the sea.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(logTag, "Five of them, flung onto an island beach,")
    }
    override fun onResume() {
        super.onResume()
        Log.d(logTag, "Survived.")
    }
    override fun onPause() {
        super.onPause()
        Log.d(logTag, "A Pacific Ocean — A blue demi - globe.")
    }
    override fun onStop() {
        super.onStop()
        Log.d(logTag, "Islands like punctuation marks.")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag, "A cruising airliner; Passengers unwrapping pats of butter.")
    }
}