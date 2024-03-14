package org.pebiblioteca

data class Revista(
    val titulorevista: String
):ElementoBiblioteca(titulo = titulorevista) {
    override fun prestar() {
        TODO("Not yet implemented")
    }

    override fun devolver() {
        TODO("Not yet implemented")
    }
}