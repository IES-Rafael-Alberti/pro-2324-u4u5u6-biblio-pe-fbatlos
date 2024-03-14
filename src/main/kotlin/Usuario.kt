package org.pebiblioteca

/**
 * Genera al usuario.
 * @param id Es la id del usuario para la biblioteca.
 * @param nombre Es el nombre del usuario
 */
open class Usuario (val id:Int,val nombre:String){
    private var listaLibros = mutableListOf<Libro>()
    init {
        require(nombre.isNotEmpty()){"El nombre no puede estar vacio."}
    }

    /**
     * Agrega libro al listado de libros.
     */
    fun agregarLibro(libro: Libro){
        listaLibros.add(libro)
    }

    /**
     * Quita el libro de prestamos del usuario.
     */
    fun quitarLibro(libro: Libro){
        listaLibros.remove(libro)
    }
}