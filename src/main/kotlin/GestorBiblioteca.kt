package org.pebiblioteca

class GestorBiblioteca(catalogo:Catalogo, val registro:RegistroPrestamos){
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
        if (libro.estado == estadoLibro.diponible) {
            libro.estado = estadoLibro.prestado
            registro.agregarAlRegistro(libro.id, "Hemos prestado el libro ${libro.titulo}")
        }else{
            println("Ese libro ya esta prestado.")
        }
    }

    /**
     * Se devolverá el libro y se anotará en el registro.
     */
    fun devolverLibro(libro: Libro){
        if (libro.estado == estadoLibro.prestado) {
            libro.estado = estadoLibro.diponible
            registro.agregarAlRegistro(libro.id, "Hemos recibido el libro ${libro.titulo} del prestamo.")
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
        println("Libros disponibles")
        catalogoBiblioteca.libros.forEach {
            if(disponivilidad(it)){
                println(it.titulo)
            }else{
                librosPrestados.add(it)
            }
        }

        if (librosPrestados.isEmpty()){
            println("No hemos prestado ninguno")
        }else{
            println("Libros prestados")
            librosPrestados.forEach { println(it) }
        }
    }
}