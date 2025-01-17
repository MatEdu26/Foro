package com.foro.ForoAlura.domain.topico.respuesta.validaciones;

import com.foro.ForoAlura.domain.topico.TopicoRepository;
import com.foro.ForoAlura.domain.topico.respuesta.DatosCrearRespuesta;
import com.foro.ForoAlura.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoValido implements ValidadorRespuesta {

    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idTopico() == null || !topicoRepository.existsById(datos.idTopico())) {
            throw new ValidacionDeIntegridad("Topico no encontrado");
        }
    }
}
