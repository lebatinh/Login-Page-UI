package com.example.loginpageui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logIn = findViewById<TextView>(R.id.logIn)
        val singUp = findViewById<TextView>(R.id.singUp)
        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        val singUpLayout = findViewById<LinearLayout >(R.id.singUpLayout)
//        val eMail = findViewById<TextInputEditText>(R.id.eMail)
//        val passwords = findViewById<TextInputEditText >(R.id.passwords)
        val forget = findViewById<TextView>(R.id.forget)
//        val eMails = findViewById<TextInputEditText >(R.id.eMails)
//        val passwords01 = findViewById<TextInputEditText >(R.id.passwords01)
//        val passwords02 = findViewById<TextInputEditText >(R.id.passwords02)
        val singIn = findViewById<Button>(R.id.singIn)

        logIn.setOnClickListener {
            Toast.makeText(this,"đăng nhập tài khoản đi", Toast.LENGTH_SHORT).show()
            singUp.background = null
            singUp.setTextColor(resources.getColor(R.color.white, null))
            logIn.background = resources.getDrawable(R.drawable.swt_bg, null)
            singUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.white, null))
        }
        singUp.setOnClickListener {
            Toast.makeText(this,"đăng ký tài khoản đi", Toast.LENGTH_SHORT).show()
            singUp.background = resources.getDrawable(R.drawable.swt_login, null)
            singUp.setTextColor(resources.getColor(R.color.white, null))
            logIn.background = null
            singUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
        }
        forget.setOnClickListener{
            Toast.makeText(this, "Bạn quên thì kệ bạn chứ", Toast.LENGTH_SHORT).show()
        }
        singIn.setOnClickListener {
            this.startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
        }
    }
}


