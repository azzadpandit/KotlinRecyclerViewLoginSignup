package com.example.kotlin_project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val Songs: ArrayList<Song>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_layout,parent,false)
        return MyViewHolder(view);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txttitle.text = Songs[position].title
        holder.txtDescription.text = Songs[position].description
    }

    override fun getItemCount(): Int {
        return Songs.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txttitle = itemView.findViewById<TextView>(R.id.textView)
        var txtDescription = itemView.findViewById<TextView>(R.id.textView2)
    }
}