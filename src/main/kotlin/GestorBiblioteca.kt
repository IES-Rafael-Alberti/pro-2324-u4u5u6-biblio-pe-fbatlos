package org.pebiblioteca

class GestorBiblioteca():RegistroPrestamos() {
    val catalogo = Catalogo()
    /**
     * Agregará un libro al catalogo.
     */
    fun agregarLibro(libro: Libro){
        catalogo.aniadirAlCatalogo(libro)
    }

    /**
     * Eliminará un libro del catalogo.
     */
    fun eliminarLibro(libro: Libro){
        catalogo.eliminarDelCatalogo(libro)
    }

    /**
     * Dejará constancia de prestamo del libro en el registro.
     */
    fun registrarPrestamo(libro: Libro,usuario: Usuario){
        if (libro.estado == estadoLibro.diponible) {
            libro.estado = estadoLibro.prestado
            tomarPrestadoLibro(libro,usuario)
        }else{
            println("Ese libro ya esta prestado.")
        }
    }

    /**
     * Se devolverá el libro y se anotará en el registro.
     */
    fun devolverLibro(libro: Libro,usuario: Usuario){
        if (libro.estado == estadoLibro.prestado) {
            libro.estado = estadoLibro.diponible
            agregarAlRegistro(libro,usuario)
        }else{
            println("El libro ya fue devuelto.")
        }
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
        val librosPrestados = mutableListOf<Libro>()
        println("\nLibros disponibles:\n")
        catalogo.libros.forEach {
            if(disponivilidad(it)){
                println(it.titulo)
            }else{
                librosPrestados.add(it)
            }
        }
        println("\nLibros prestados : \n")
        if (librosPrestados.isEmpty()){
            println("No hemos prestado ninguno")
        }else{
        librosPrestados.forEach { println(it.titulo) }}
    }


}