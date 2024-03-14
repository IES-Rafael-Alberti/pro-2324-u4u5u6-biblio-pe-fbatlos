package org.pebiblioteca

data class Libro(val id:Int, val titulo:String, val autor:String, val anioPubli:Int, val tematica:String, var estado:estadoLibro = estadoLibro.diponible){
    init {
        require(titulo.isNotEmpty()){"El titulo no puede estar vacio."}
        require(autor.isNotEmpty()){"El autor no puede estar vacio."}
        require(tematica.isNotEmpty()){"La tematica no puede estar vacia."}
        require(anioPubli in 1..2024){"No es posible el año de publicacion."}
    }
}