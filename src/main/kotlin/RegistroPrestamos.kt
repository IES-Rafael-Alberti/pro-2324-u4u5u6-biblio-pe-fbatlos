package org.pebiblioteca

import java.util.UUID

class RegistroPrestamos{
    val registro = mutableMapOf<UUID?,String>()

    /**
     * guardará cada accion con su id del libro
     */
    fun agregarAlRegistro(id:UUID?,accion:String){
        registro.put(id,accion)
    }

}