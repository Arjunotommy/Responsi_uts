package com.example.responsi_360

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.responsi_360.formbiodata
import kotlinx.android.synthetic.main.biodata.*
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.register.*

class register_ac : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Hobi = Hobi.text
        val nama = Edit_Nama.text
        val Umur = Umur.text
        val Email = Email.text
        val Username = Username.text
        val Jk= Jk.text

        prosses.setOnClickListener {
            intent = Intent(this,formbiodata::class.java)
            intent.putExtra("Hobi", Hobi)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai",Umur)
            intent.putExtra("Email", Email)
            intent.putExtra("Username", Username)
            intent.putExtra("jk",Jk)

        }
    }
}
