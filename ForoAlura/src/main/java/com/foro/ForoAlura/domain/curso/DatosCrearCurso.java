package com.foro.ForoAlura.domain.curso;

import jakarta.validation.constraints.NotNull;

public record DatosCrearCurso(
        @NotNull
        String nombre,
        @NotNull
        Categoria categoria
) {
}
