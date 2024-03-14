package org.pebiblioteca

import java.util.UUID

fun main() {
    val usuario1 = Usuario(1,"Jose")
    val usuario2 = Usuario(2,"Mario")
    val gestionBiblioteca = GestorBiblioteca(RegistroPrestamos())
    val libro1 = Libro("Pep guardiola" ,2004,"Deportes","Pep el ciego")
    val libro2 = Libro("Juan Guardado" ,2024,"Aventuras","Jose el cantante")
    val libro3 = Libro("Klopp" ,2020,"Deportes","Klopp el ciego")
    val dvd1 = DVD("Mundial 2004")
    val revista1 = Revista("Mbappe al Madrid")

    gestionBiblioteca.agregarLibro(libro1)
    gestionBiblioteca.agregarLibro(libro2)
    gestionBiblioteca.agregarLibro(libro3)
    gestionBiblioteca.agregarLibro(dvd1)
    gestionBiblioteca.agregarLibro(revista1)

    gestionBiblioteca.registrarPrestamo(libro1,usuario1)
    gestionBiblioteca.registrarPrestamo(libro2,usuario2)
    gestionBiblioteca.registrarPrestamo(dvd1,usuario1)

    gestionBiblioteca.mostrarLibros()

    gestionBiblioteca.devolverLibro(dvd1,usuario1)

    gestionBiblioteca.mostrarLibros()

}