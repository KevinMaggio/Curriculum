package com.example.curriculumkevinmaggio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuienSoyAdapter(private val listFotos:List<String>):RecyclerView.Adapter<QuienSoyHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuienSoyHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return QuienSoyHolder(layoutInflater.inflate(R.layout.item_quien_soy,parent,false))
    }

    override fun onBindViewHolder(holder: QuienSoyHolder, position: Int) {
        holder.render(listFotos[position])
    }

    override fun getItemCount(): Int {
        return listFotos.size
    }
}