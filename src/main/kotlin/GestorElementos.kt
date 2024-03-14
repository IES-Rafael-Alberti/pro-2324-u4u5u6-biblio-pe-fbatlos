package org.pebiblioteca

class GestorElementos<T>{
    val todosLosElementos = mutableListOf<T>()

    fun agregar(elementoBiblioteca:T){
        todosLosElementos.add(elementoBiblioteca)
    }

    fun eliminar(elementoBiblioteca: T){
        todosLosElementos.remove(elementoBiblioteca)
    }
}