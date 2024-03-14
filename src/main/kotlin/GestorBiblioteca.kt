package org.pebiblioteca

class GestorBiblioteca(catalogo:Catalogo,registro:RegistroPrestamos){
    val catalogoBiblioteca = catalogo

    /**
     * Agregará un libro al catalogo.
     */
    fun agregarLibro(libro: Libro){
        catalogoBiblioteca.aniadirAlCatalogo(libro)
    }

    /**
     * Eliminará un libro del catalogo.
     */
    fun eliminarLibro(libro: Libro){
        catalogoBiblioteca.eliminarDelCatalogo(libro)
    }

    /**
     * Dejará constancia de prestamo del libro en el registro.
     */
    fun registrarPrestamo(libro: Libro){
        libro.estado = estadoLibro.prestado
    }

    /**
     * Se devolverá el libro y se anotará en el registro.
     */
    fun devolverLibro(libro: Libro){
        libro.estado = estadoLibro.diponible
    }
    /**
     * Se comprobará si el libro está disponible o no.
     */
    fun disponivilidad(libro: Libro):Boolean{
        if (libro.estado == estadoLibro.diponible){
            return true
        }else{
            return false
        }
    }
    /**
     * Retorna los libros segun su estado.
     */
    fun mostrarLibros(){

    }
}