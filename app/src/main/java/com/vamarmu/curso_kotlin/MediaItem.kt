package com.vamarmu.curso_kotlin

data class MediaItem(val title :String, val resource: String, val type : Type){
    enum class Type {
        PHOTO,VIDEO
    }
}
