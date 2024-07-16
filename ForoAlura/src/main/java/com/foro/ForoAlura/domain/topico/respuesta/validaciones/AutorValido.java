package com.foro.ForoAlura.domain.topico.respuesta.validaciones;

import com.foro.ForoAlura.domain.topico.respuesta.DatosCrearRespuesta;
import com.foro.ForoAlura.domain.usuario.UsuarioRepository;
import com.foro.ForoAlura.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}
