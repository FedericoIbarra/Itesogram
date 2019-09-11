package com.example.tarea04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.parse.ParseObject
import com.parse.ParseQuery


class ActivitySaveInParse : AppCompatActivity() {

    private lateinit var valorEnParse: TextInputEditText
    private lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_in_parse)
        valorEnParse = findViewById(R.id.valorInput)
        texto = findViewById(R.id.label1)
    }

    fun guardarParseo(view: View) {
        valorEnParse.setText("").toString()

        val studentObject = ParseObject("Tarea")
        studentObject.put("Expediente", "is702981")
        studentObject.put("valor", valorEnParse.text.toString())
        studentObject.saveInBackground()

    }

    fun obetenerValor(view: View) {
        val query = ParseQuery<ParseObject>("Tarea")
        query.whereEqualTo("Expediente","is702981")
        query.addDescendingOrder("createdAt")
        query.getFirstInBackground{obj, e ->
            if (e == null)
                texto.text = obj["valor"] as String
            else
                error { e }
        }
    }



}
