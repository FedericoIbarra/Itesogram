package com.example.tarea04

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat

class ActivityLogin : AppCompatActivity() {

   // val drawable: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.itesogram, null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, ActivitySaveInParse::class.java)
        intent.putExtra("SHOW_WLCOME", true)
        startActivity(intent)
    }
}
