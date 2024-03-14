package org.pebiblioteca

class RegistroPrestamos{
    val registro = mutableMapOf<Int,String>()

    /**
     * guardará cada accion con su id del libro
     */
    fun agregarAlRegistro(id:Int,accion:String){
        registro.put(id,accion)
    }

}