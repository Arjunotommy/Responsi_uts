package com.example.responsi_360

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.responsi_360.MainActivity
import kotlinx.android.synthetic.main.biodata.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.password
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_register.setOnClickListener {
            val intent = Intent(this,dasboard_ac::class.java)
            startActivity(intent)
            finish()
        }
        btn_login.setOnClickListener {
            val username = Username.text.toString()
            val password = Password.text.toString()
            if (username.isEmpty()|| password.isEmpty()){
                Toast.makeText(this, " Please Insert Username and password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (username=="Niko0364"|| password=="Niko364"){
                val progressDialog= ProgressDialog(this,R.style.Theme_AppCompat_Light_Dialog)
                progressDialog.setMessage("authenticating")
                progressDialog.show()
                val intent = Intent(this,dasboard_ac::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
