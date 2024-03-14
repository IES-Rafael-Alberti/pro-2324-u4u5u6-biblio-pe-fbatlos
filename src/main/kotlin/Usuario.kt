package org.pebiblioteca

/**
 * Genera al usuario.
 * @param id Es la id del usuario para la biblioteca.
 * @param nombre Es el nombre del usuario
 */
open class Usuario (val id:Int,val nombre:String){
    private var listaLibros = mutableListOf<ElementoBiblioteca>()
    init {
        require(nombre.isNotEmpty()){"El nombre no puede estar vacio."}
    }

    /**
     * Agrega libro al listado de libros.
     */
    fun agregarLibro(elementoBiblioteca: ElementoBiblioteca){
        listaLibros.add(elementoBiblioteca)
    }

    /**
     * Quita el libro de prestamos del usuario.
     */
    fun quitarLibro(elementoBiblioteca: ElementoBiblioteca){
        listaLibros.remove(elementoBiblioteca)
    }
}