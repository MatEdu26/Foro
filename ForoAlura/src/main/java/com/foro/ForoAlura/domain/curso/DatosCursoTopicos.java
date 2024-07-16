package com.foro.ForoAlura.domain.curso;

import com.foro.ForoAlura.domain.topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(DatosCurso curso, Page<DatosTopico> topicos) {

}
