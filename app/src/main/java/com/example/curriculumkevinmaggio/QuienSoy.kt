package com.example.curriculumkevinmaggio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculumkevinmaggio.databinding.ActivityQuienSoyBinding

class QuienSoy : AppCompatActivity() {

    private lateinit var binding: ActivityQuienSoyBinding
    private val data=Data()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQuienSoyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()

    }
    
    fun initRecycler(){
        val adapter=QuienSoyAdapter(data.getLista())
        binding.rvQuienSoy.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rvQuienSoy.adapter=adapter
    }
}