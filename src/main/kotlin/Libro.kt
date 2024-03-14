package org.pebiblioteca

import java.util.*

data class Libro(
    private val autor:String,
    private val anioPubli:Int,
    private val tematica:String,
    val tituloLibro:String,
    ): ElementoBiblioteca(titulo = tituloLibro) {

 init {
     require(autor.isNotEmpty()){"El autor no puede estar vacio."}
     require(tematica.isNotEmpty()){"La tematica no puede estar vacia."}
     require(anioPubli in 1..2024){"No es posible el año de publicacion."}
 }

    override fun prestar() {
        TODO("Not yet implemented")
    }

    override fun devolver() {
        TODO("Not yet implemented")
    }
}