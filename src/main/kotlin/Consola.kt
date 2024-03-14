package org.pebiblioteca

class Consola {
    fun menu(){
        println("\n1 Agregar un libro al catálogo.\n2 Eliminar un libro del catálogo.\n3 Realizar un préstamo.\n4 Devolver un libro\n5 Consultar disponibilidad de un libro.\n6 Ver todos los libros.\n0 Salir.\n")
    }

    fun repuestaMenu(){
        var repuesta:Int
        var valido = false
        do {
            try {
                repuesta = readln().toInt()
                valido = true
            }catch (_:Exception){
                println("Solo permitimos numeros.")
            }
        }while (!valido)
    }

}