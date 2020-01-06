package com.example.yukamalcoba.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.yukamalcoba.R
import kotlinx.android.synthetic.main.activity_donasi.*

class DonasiActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donasi)

        button = findViewById(R.id.donasi)
        button.setOnClickListener{
            val intent = Intent(this, DetailDonasiActivity::class.java)
            startActivity(intent)
        }

    }
        fun onCheckboxClicked(view: View) {
        var checked = view as CheckBox
        if (infaq == checked) {
            message(infaq.text.toString() + if (infaq.isChecked) " Checked " else " UnChecked ")
        }
        if (zakat == checked) {
            message(zakat.text.toString() + if (zakat.isChecked) " Checked " else " UnChecked ")
        }

        if (wakaf == checked) {
            message(wakaf.text.toString() + if (wakaf.isChecked) " Checked " else " UnChecked ")
        }
    }
    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
}