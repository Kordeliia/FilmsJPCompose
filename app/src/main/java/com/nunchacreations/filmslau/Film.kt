package com.nunchacreations.filmslau

data class Film(
    val name: String,
    val fecha: Int,
    val filmCast : MutableList<String>,
    val description: String,
    val score: Int,
    val photoURL: String,
    val genre: MutableList<String>
)
