package org.pebiblioteca

import java.util.UUID

fun main() {
    val usuario1 = Usuario(1,"Jose")
    val usuario2 = Usuario(2,"Mario")
    val gestionBiblioteca = GestorBiblioteca()
    val libro1 = Libro("Pep el ciego","Pep guardiola" ,2004,"Deportes")
    val libro2 = Libro("Jose el cantante","Juan Guardado" ,2024,"Aventuras")
    val libro3 = Libro("Klopp el ciego","Klopp" ,2020,"Deportes")

    gestionBiblioteca.agregarLibro(libro1)
    gestionBiblioteca.agregarLibro(libro2)
    gestionBiblioteca.agregarLibro(libro3)

    gestionBiblioteca.registrarPrestamo(libro1,usuario1)
    gestionBiblioteca.registrarPrestamo(libro2,usuario2)

    gestionBiblioteca.mostrarLibros()

    println(gestionBiblioteca.consultarHistorialUsuario(usuario1))

}