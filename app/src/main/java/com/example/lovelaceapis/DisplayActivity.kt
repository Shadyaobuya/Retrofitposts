package com.example.lovelaceapis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.POST
import javax.security.auth.callback.Callback

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var btnPost=findViewById<Button>(R.id.btnPosts)
    btnPost.setOnClickListener {
        var intent=Intent(baseContext,ChoiceActivity::class.java)
        startActivity(intent)
    }

    }
   }