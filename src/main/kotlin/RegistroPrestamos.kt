package org.pebiblioteca

import java.util.UUID

open class RegistroPrestamos(){
    val registro = mutableMapOf<UUID?,String>()
    val historial = mutableMapOf<String,MutableList<String>>()


    /**
     * guardará cada accion del libro y su usuario
     */
    fun agregarAlRegistro(libro:Libro,usuario: Usuario){
        usuario.quitarLibro(libro)
        registro.put(libro.id,"Hemos recibido el libro ${libro.titulo} del prestamo.")
        registrarAccion(usuario.nombre,"${usuario.nombre} ha devuelto el libro ${libro.titulo}")
    }

    private fun registrarAccion(nombre: String, accion: String) {
        historial[nombre]?.add(accion)
    }

    fun tomarPrestadoLibro(libro: Libro,usuario: Usuario){
        usuario.agregarLibro(libro)
        registro.remove(libro.id)
       registrarAccion(usuario.nombre,"${usuario.nombre} ha tomado prestado el libro ${libro.titulo}")
    }

    fun consultarHistorialUsuario(usuario: Usuario): MutableList<String> {
        if (comprobarHistorialValido(historial[usuario.nombre])){
            return historial[usuario.nombre]!!
        }else{
            return mutableListOf("No hay registro.")
        }
    }

    fun consultarHistorialLibro(libro: Libro): String? {
       return registro[libro.id]
    }

    fun comprobarHistorialValido(historial:MutableList<String>?): Boolean {
        if (historial.isNullOrEmpty()){
            return false
        }else{
            return true
        }
    }
}