package com.example.yukamalcoba.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.yukamalcoba.Adapter.MyListAdapter
import com.example.yukamalcoba.Model.Model
import com.example.yukamalcoba.R

class InformasiActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)

        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(
            Model(
                "Masjid Darul Jannah",
                "Cimpauen Tapos Depok",
                R.drawable.gambar_masjid
            )
        )
        list.add(
            Model(
                "Masjid Baiturrahman",
                "Sukmajaya Depok",
                R.drawable.masjid
            )
        )
        list.add(
            Model(
                "Masjid Jami' Nurul Huda",
                "Tirtajaya Sukmajaya Depok",
                R.drawable.gambar_masjid
            )
        )
        list.add(
            Model(
                "Masjid Al-Falah",
                "Perum Anggrek 3 GDC Depok",
                R.drawable.masjid
            )
        )
        list.add(
            Model(
                "Masjid Al-Hijrah",
                "Baktijaya Sukmajaya Depok",
                R.drawable.gambar_masjid
            )
        )

        listView.adapter = MyListAdapter(
            this,
            R.layout.row,
            list
        )

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                val intent = Intent(this, Informasi1Activity::class.java)
                startActivity(intent)
            }
            if (position==1){
                val intent = Intent(this, Informasi1Activity::class.java)
                startActivity(intent)
            }
            if (position==2){
                val intent = Intent(this, Informasi1Activity::class.java)
                startActivity(intent)
            }
            if (position==3){
                val intent = Intent(this, Informasi1Activity::class.java)
                startActivity(intent)
            }
            if (position==4){
                val intent = Intent(this, Informasi1Activity::class.java)
                startActivity(intent)
            }
        }
    }
}