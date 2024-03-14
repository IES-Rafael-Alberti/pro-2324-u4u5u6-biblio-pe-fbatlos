package org.pebiblioteca

data class DVD(
    val informacion:String
):ElementoBiblioteca(titulo = informacion){
    override fun prestar() {
        TODO("Not yet implemented")
    }

    override fun devolver() {
        TODO("Not yet implemented")
    }
}