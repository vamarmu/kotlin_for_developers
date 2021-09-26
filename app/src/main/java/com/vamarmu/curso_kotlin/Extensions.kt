package com.vamarmu.curso_kotlin

import android.media.Image
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadUrl(url : String){
    Glide.with(this).load(url).into(this)
}