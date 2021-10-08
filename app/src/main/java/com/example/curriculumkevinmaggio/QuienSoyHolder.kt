package com.example.curriculumkevinmaggio

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculumkevinmaggio.databinding.ItemQuienSoyBinding
import com.squareup.picasso.Picasso

class QuienSoyHolder(view:View):RecyclerView.ViewHolder(view) {

    private  var binding= ItemQuienSoyBinding.bind(view)


    fun render (string:String){
        Picasso.get().load(string).into(binding.ivRecycler)
    }
}