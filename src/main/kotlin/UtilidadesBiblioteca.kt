package org.pebiblioteca

import java.util.Random
import java.util.UUID

class UtilidadesBiblioteca {
    /**
     * Generará una UUID unica.
     * @return La UUID tipo Int
     */
    fun generarIdentificadorUnico(): UUID? {
        val UUIDLibro = UUID.randomUUID()
        return UUIDLibro
    }

}