package org.pebiblioteca

import java.util.*

interface IGestorPrestamos{
    val registro: MutableMap<UUID?, String>
    val historial: MutableMap<String, MutableList<String>>


    /**
     * guardará cada accion del libro y su usuario
     */
    fun agregarAlRegistro(libro:ElementoBiblioteca,usuario: Usuario){
        usuario.quitarLibro(libro)
        registro.put(libro.id,"Hemos recibido el libro ${libro.titulo} del prestamo.")
        registrarAccion(usuario.nombre,"${usuario.nombre} ha devuelto el libro ${libro.titulo}")
    }

    private fun registrarAccion(nombre: String, accion: String) {
        historial[nombre]?.add(accion)
    }

    fun tomarPrestadoLibro(libro: ElementoBiblioteca,usuario: Usuario){
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