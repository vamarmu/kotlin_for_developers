package com.vamarmu.curso_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vamarmu.curso_kotlin.databinding.MediaItemBinding

class MediaAdapter( private val dataSet: List<MediaItem>, private val onItemClick:(MediaItem)->Unit): RecyclerView.Adapter<MediaAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaAdapter.ViewHolder {

        val binding = MediaItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MediaAdapter.ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { onItemClick(item) }

    }

    override fun getItemCount(): Int = dataSet.size


    inner class ViewHolder(private val binding: MediaItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(mediaItem : MediaItem){
            with(binding){
                mediaTitle.text = mediaItem.title
                mediaThumb.loadUrl(mediaItem.resource)
                mediaVideoIndicator.visibility = when(mediaItem.type){
                    MediaItem.Type.PHOTO -> View.GONE
                    MediaItem.Type.VIDEO -> View.VISIBLE
                }
            }

        }
    }



}