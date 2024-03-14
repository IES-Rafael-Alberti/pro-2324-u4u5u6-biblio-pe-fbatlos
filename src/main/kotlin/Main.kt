package org.pebiblioteca

import java.util.UUID

fun main() {

    val gestionBiblioteca = GestorBiblioteca(Catalogo(), RegistroPrestamos())
    val libro1 = Libro("Pep el ciego","Pep guardiola" ,2004,"Deportes")
    val libro2 = Libro("Jose el cantante","Juan Guardado" ,2024,"Aventuras")
    val libro3 = Libro("Klopp el ciego","Klopp" ,2020,"Deportes")

    gestionBiblioteca.agregarLibro(libro1)
    gestionBiblioteca.agregarLibro(libro2)
    gestionBiblioteca.agregarLibro(libro3)

    gestionBiblioteca.registrarPrestamo(libro1)
    gestionBiblioteca.registrarPrestamo(libro1)

    gestionBiblioteca.devolverLibro(libro1)
    gestionBiblioteca.devolverLibro(libro3)

    gestionBiblioteca.mostrarLibros()

}