package org.pebiblioteca

import java.util.*

data class Libro( val titulo:String,private val autor:String,private val anioPubli:Int,private val tematica:String, var estado:estadoLibro = estadoLibro.diponible){
    val id: UUID? = UtilidadesBiblioteca().generarIdentificadorUnico()
    init {
        require(titulo.isNotEmpty()){"El titulo no puede estar vacio."}
        require(autor.isNotEmpty()){"El autor no puede estar vacio."}
        require(tematica.isNotEmpty()){"La tematica no puede estar vacia."}
        require(anioPubli in 1..2024){"No es posible el año de publicacion."}
    }
}