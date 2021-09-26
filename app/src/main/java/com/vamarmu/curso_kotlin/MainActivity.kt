package com.vamarmu.curso_kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vamarmu.curso_kotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = MediaAdapter(listOf(
            MediaItem("Gatito 1","https://placekitten.com/200/200?image=1",MediaItem.Type.VIDEO),
            MediaItem("Gatito 2","https://placekitten.com/200/200?image=2",MediaItem.Type.PHOTO),
            MediaItem("Gatito 3","https://placekitten.com/200/200?image=3",MediaItem.Type.PHOTO),
            MediaItem("Gatito 4","https://placekitten.com/200/200?image=4",MediaItem.Type.VIDEO),
            MediaItem("Gatito 5","https://placekitten.com/200/200?image=5",MediaItem.Type.PHOTO),
            MediaItem("Gatito 6","https://placekitten.com/200/200?image=6",MediaItem.Type.PHOTO),
            MediaItem("Gatito 7","https://placekitten.com/200/200?image=7",MediaItem.Type.VIDEO),
            MediaItem("Gatito 8","https://placekitten.com/200/200?image=8",MediaItem.Type.PHOTO),
            MediaItem("Gatito 9","https://placekitten.com/200/200?image=9",MediaItem.Type.VIDEO),

        )){ Toast.makeText(this,it.title,Toast.LENGTH_SHORT).show()}

    }




}