## Foro

Creacion del backend de un foro. Parte de un desafio de Alura latam y Oracle para el progama ONE

## Descripción del Desafío
Un foro es un espacio donde los participantes de una plataforma pueden plantear sus preguntas sobre diferentes temas. En Alura Latam, los estudiantes utilizan el foro para resolver dudas sobre los cursos y proyectos en los que participan. Este lugar es un espacio de aprendizaje y colaboración entre estudiantes, profesores y moderadores.

Aunque conocemos la funcionalidad y el aspecto del foro, ¿sabemos cómo funciona internamente? Es decir, ¿dónde se almacenan los datos? ¿Cómo se relacionan los temas con las respuestas, o los usuarios con las respuestas de un tema?

Este es el desafío llamado Foro, en el que vamos a replicar este proceso a nivel de back-end, creando una API REST utilizando Spring.

## Objetivos del Proyecto
La API se centrará específicamente en los temas (topicos) y debe permitir a los usuarios:

1. Crear un nuevo tema
2. Mostrar todos los temas creados
3. Mostrar un tema específico
4. Actualizar un tema
5. Eliminar un tema

Esto corresponde a las operaciones básicas de CRUD (Create, Read, Update, Delete).

## Requisitos de la API
1. Implementar rutas siguiendo las mejores prácticas del modelo REST
2. Realizar validaciones según las reglas de negocio
3. Implementar una base de datos relacional para persistir la información
4. Implementar un servicio de autenticación/autorización para restringir el acceso a la información

En resumen, el objetivo de este desafío es implementar una API REST con las funcionalidades mencionadas, utilizando Spring como framework para facilitar el desarrollo.


## Configuraciones del entorno y dependencias usadas
<ul>
  <li>
    Java (versión 17) 
  </li>
  <li>
    Maven (versión 4)
  </li>
  <li>
    Spring Boot (versión 3.3.0)
    Dependencias:
      <ul>
        <li>
          Lombok  
        </li>
        <li>
          Spring Web
        </li>
        <li>
          Spring Boot DevTools
        </li>
        <li>
          Spring Data JPA
        </li>
        <li>
          Flyway Migration
        </li>
        <li>
          MySQL Driver
        </li>
        <li>
          Validation
        </li>
        <li>
          Spring Security
        </li>
      </ul>
  </li>
</ul>
