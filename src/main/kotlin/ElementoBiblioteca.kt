package org.pebiblioteca

import java.util.UUID

abstract class ElementoBiblioteca( val titulo:String):Prestable {
    var estado:estadoLibro = estadoLibro.diponible
    val id:UUID?= UtilidadesBiblioteca().generarIdentificadorUnico()
    init {
        require(titulo.isNotEmpty()){"El titulo no puede estar vacio."}

    }

}