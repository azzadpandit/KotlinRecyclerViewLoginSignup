package com.example.kotlin_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class dashbord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashbord)
        //get recyler view from xml
        val recyclerview = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val songsObjects = ArrayList<Song>()
        songsObjects.add(Song("Alu", "42/kg"))
        songsObjects.add(Song("Apple", "18/kg"))
        songsObjects.add(Song("Mango", "10/kg "))
        songsObjects.add(Song("Sweet", "10/kg"))
        songsObjects.add(Song("Banana", "44/kg"))


        //creating our adapter
        val adapter = MyAdapter(songsObjects)

        //now adding the adapter to recyclerview
        recyclerview.adapter = adapter
    }
}


