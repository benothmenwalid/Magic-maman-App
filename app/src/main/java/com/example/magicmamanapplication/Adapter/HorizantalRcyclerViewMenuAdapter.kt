package com.example.magicmamanapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.magicmamanapplication.MenuItem
import com.example.magicmamanapplication.R

class HorizantalRcyclerViewMenuAdapter(private val menuList: List<MenuItem>)
    : RecyclerView.Adapter<HorizantalRcyclerViewMenuAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemview = LayoutInflater.from(parent.context).inflate(R.layout.etat, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = menuList[position]
        holder.imageView1.setImageResource(currentItem.imgRessource1)
        holder.imageView2.setImageResource(currentItem.imgRessource2)
    }

    override fun getItemCount()= menuList.size



    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView1 : ImageView= itemView.findViewById(R.id.img_view)
        val imageView2 : ImageView= itemView.findViewById(R.id.img_view2)
    }
}