package org.pebiblioteca

/**
 * Tenemos la clase que guardará los libros en forma de catalogo.
 */
class Catalogo(){
    val libros = mutableListOf<Libro>()

    /**
     * Añadiremos al catalogo los libros que nos den
     */
    fun aniadirAlCatalogo(libro: Libro) {
        libros.add(libro)
    }

    /**
     * Eliminaremos del catalogo los libros que nos den
     */
    fun eliminarDelCatalogo(libro: Libro){
        libros.remove(libro)
    }
}
