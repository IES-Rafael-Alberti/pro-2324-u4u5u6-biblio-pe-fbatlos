package org.pebiblioteca

/**
 * Tenemos la clase que guardará los libros en forma de catalogo.
 */
open class Catalogo(){
    val elementoBibliotecas = mutableListOf<ElementoBiblioteca>()

    /**
     * Añadiremos al catalogo los libros que nos den
     */
    fun aniadirAlCatalogo(elementoBiblioteca: ElementoBiblioteca) {
        elementoBibliotecas.add(elementoBiblioteca)
    }

    /**
     * Eliminaremos del catalogo los libros que nos den
     */
    fun eliminarDelCatalogo(elementoBiblioteca: ElementoBiblioteca){
        elementoBibliotecas.remove(elementoBiblioteca)
    }
}
