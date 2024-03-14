package org.pebiblioteca

class GestorBiblioteca(val gestor:IGestorPrestamos) {
    val catalogo = Catalogo()
    /**
     * Agregará un libro al catalogo.
     */
    fun agregarElemento(libro: ElementoBiblioteca){
        catalogo.aniadirAlCatalogo(libro)
    }

    /**
     * Eliminará un libro del catalogo.
     */
    fun eliminarLibro(libro: ElementoBiblioteca){
        catalogo.eliminarDelCatalogo(libro)
    }

    /**
     * Dejará constancia de prestamo del libro en el registro.
     */
    fun registrarPrestamo(libro: ElementoBiblioteca,usuario: Usuario){
        if (libro.estado == estadoLibro.diponible) {
            libro.estado = estadoLibro.prestado
            gestor.tomarPrestadoLibro(libro,usuario)
        }else{
            println("Ese libro ya esta prestado.")
        }
    }

    /**
     * Se devolverá el libro y se anotará en el registro.
     */
    fun devolverElemento(libro: ElementoBiblioteca, usuario: Usuario){
        if (libro.estado == estadoLibro.prestado) {
            libro.estado = estadoLibro.diponible
            gestor.agregarAlRegistro(libro,usuario)
        }else{
            println("El libro ya fue devuelto.")
        }
    }
    /**
     * Se comprobará si el libro está disponible o no.
     */
    fun disponivilidad(libro: ElementoBiblioteca):Boolean{
        if (libro.estado == estadoLibro.diponible){
            return true
        }else{
            return false
        }
    }
    /**
     * Retorna los libros segun su estado.
     */
    fun mostrarElementos(){
        val librosPrestados = mutableListOf<ElementoBiblioteca>()
        println("\nElementos disponibles en la Biblioteca:\n")
        catalogo.elementoBibliotecas.forEach {
            if(disponivilidad(it)){
                println(it.titulo)
            }else{
                librosPrestados.add(it)
            }
        }
        println("\nElementos prestados : \n")
        if (librosPrestados.isEmpty()){
            println("No hemos prestado ninguno")
        }else{
        librosPrestados.forEach { println(it.titulo) }}
    }


}