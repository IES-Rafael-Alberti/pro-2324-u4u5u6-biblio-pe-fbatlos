package org.pebiblioteca

import java.util.UUID

class RegistroPrestamos(
    override val registro: MutableMap<UUID?, String> = mutableMapOf(),
    override val historial: MutableMap<String, MutableList<String>> = mutableMapOf()
):IGestorPrestamos