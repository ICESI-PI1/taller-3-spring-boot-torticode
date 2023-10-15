
#**Informe: Taller III**

##**Integrantes:**


* Carlos Javier Bolaños Riascos - A00377995
* Danna Alexandra Espinosa Arenas - A00378613

##**Descripción:**

Este informe corresponde al Taller III de Spring Boot con API REST del curso "Computación en Internet II" de la Universidad Icesi. El taller se enfoca en aplicar los conocimientos adquiridos sobre Spring y Spring Boot en la creación de una aplicación que expone una API REST para gestionar libros y autores. Además, se implementa un sistema de autenticación utilizando JSON Web Tokens (JWT).

##**Requisitos previos**

Se debe asegurar tener instalado en el entorno de desarrollo lo siguiente:

* JAVA DEVEOPMENT KIT (JDK) VERSION 17
* Spring Boot
* Maven
* Postman (para probar la API)

##**Estándar de Commits:**
Para el control de versiones, se utilizó el estándar de commits convencionales. Cada commit sigue una estructura con un tipo/título y una descripción separados por un guion bajo (_).

##**Convención de Estilo de Código:**
Durante el desarrollo, se siguió la convención CamelCase para nombrar identificadores como variables, funciones y clases. Esta convención implica que las palabras no llevan espacios ni guiones, y cada palabra adicional comienza con mayúscula. La primera letra de la primera palabra puede estar en minúscula o mayúscula, dependiendo del identificador.

##**Proceso:**
La aplicación Spring Boot tiene como objetivo principal la gestión de una librería. El sistema permite realizar las siguientes operaciones:

###**Operaciones CRUD para Autores:**
* Crear un autor
* Listar todos los autores
* Obtener un autor por ID
* Actualizar un autor
* Eliminar un autor
###**Operaciones CRUD para Libros:**
* Crear un libro
* Listar todos los libros
* Obtener un libro por ID
* Actualizar un libro
* Eliminar un libro

###**Operaciones para Listar Todos los Autores y Libros:**
* Listar todos los autores
* Listar todos los libros

Para cumplir con estos requerimientos, la aplicación se estructuró siguiendo el patrón Modelo-Vista-Controlador (MVC). Se crearon los siguientes paquetes:

**Controller:** Se utiliza para gestionar las solicitudes del usuario y las vistas, conectándolas con la lógica de negocio apropiada.
**Persistence:** Contiene la lógica necesaria para garantizar el almacenamiento de la información y los objetos en la base de datos o en un sistema de almacenamiento persistente.
**Service:** Contiene la lógica de negocio principal y sirve como intermediario entre la capa de persistencia/repositorio y la funcionalidad de la aplicación, implementando reglas de negocio y lógica de procesamiento.

##**Ejecución del proyecto**

Siga estos pasos para ejecutar la aplicación:

1. Clonar el Repositorio:
"""

'''
git clone https://github.com/ICESI-PI1/taller-3-spring-boot-torticode.git
'''

"""2. Abra el proyecto en su IDE preferido (sugerimos IntelliJ IDEA )
3. Ejecute la aplicación Spring Boot haciendo click en el botón "Run" (usando Maven)
3.La aplicación se iniciará en un servidor embebido y estará escuchando en el puerto predeterminado (generalmente el puerto 8080).

##**Pruebas de la API REST con Postman**

Ahora que la aplicación Spring Boot está en ejecución,se usa Postman para realizar pruebas en la API REST. A continuación, se describen las operaciones CRUD para autores y libros, así como la capacidad de listar todos los autores y libros.

###**Operaciones CRUD para Autores**

**Crear un Autor**
Método: POST

URL: http://localhost:8080/(el url que está en AuthorController)

Cuerpo (Body): JSON con los datos del autor, por ejemplo:
"""

'''
{
    "name": "Nombre del Autor",
    "nationality": "Nacionalidad del Autor"
}

'''

"""Click en "Send" para crear un nuevo autor

**Listar Todos los Autores**

Método: GET

URL: http://localhost:8080/(el url que está en AuthorController)

Haz clic en "Send" para obtener una lista de todos los autores registrados.

**Obtener un Autor por ID**

Método: GET

URL: http://localhost:8080/(el url que está en AuthorController)

Reemplaza {id} con el ID del autor que deseas obtener.

Haz clic en "Send" para obtener los detalles de un autor específico.

**Actualizar un Autor**

Método: PUT

URL: http://localhost:8080/(el url que está en AuthorController)

Reemplaza {id} con el ID del autor que deseas actualizar.

Cuerpo (Body): JSON con los datos actualizados del autor, por ejemplo:
"""

'''
{
    "name": "Nuevo Nombre del Autor",
    "nationality": "Nueva Nacionalidad del Autor"
}

'''

"""Haz clic en "Send" para actualizar el autor.

**Eliminar un Autor**

Método: DELETE

URL: http://localhost:8080/(el url que está en AuthorController)

Reemplaza {id} con el ID del autor que deseas eliminar.

Haz clic en "Send" para eliminar el autor.

**Lo anterior se hace también con las operaciones CRUD para los libros.**

###**EN RESUMEN PRUEBAS POSTMAN:**
**Operaciones CRUD para Autores**

Crear un autor: POST http://localhost:8080/api/autores

Listar todos los autores: GET http://localhost:8080/api/autores

Obtener un autor por ID: GET http://localhost:8080/api/autores/{id}

Actualizar un autor: PUT http://localhost:8080/api/autores/{id}

Eliminar un autor: DELETE http://localhost:8080/api/autores/{id}

**Operaciones CRUD para Libros**

Crear un libro: POST http://localhost:8080/api/libros

Listar todos los libros: GET http://localhost:8080/api/libros

Obtener un libro por ID: GET http://localhost:8080/api/libros/{id}

Actualizar un libro: PUT http://localhost:8080/api/libros/{id}

Eliminar un libro: DELETE http://localhost:8080/api/libros/{id}

**Listar Todos los Autores y Libros**

Listar todos los autores: GET http://localhost:8080/api/autore

Listar todos los libros: GET http://localhost:8080/api/libros

##**Autentificación con JWT**

**Autenticación de Usuarios:**

Se implementó un proceso de autenticación que verifica las credenciales proporcionadas por el usuario. Si las credenciales son válidas, se genera un token JWT y se envía al cliente como parte de la respuesta.

**Pruebas y Visualización en Postman:**

Para visualizar la autenticación JWT en acción, se utilizaron solicitudes en Postman. Al incluir el token JWT válido en la cabecera Authorization, con el prefijo "Bearer" (Authorization: Bearer su-token-jwt), se pudo probar el acceso a rutas protegidas y rutas públicas para verificar que la autenticación funcionara correctamente.

##**Complicaciones:**
Durante el desarrollo del proyecto, enfrentamos varias complicaciones, especialmente en el manejo adecuado de JWT, ya que los recursos de referencia iniciales estaban obsoletos. Las dificultades incluyeron:

**Implementación de JWT:** La falta de recursos actualizados para implementar JWT en Spring Boot generó desafíos. Fue necesario investigar y adaptar el código a partir de varias fuentes para lograr una implementación exitosa.

**Comunicación segura:** Asegurarnos de que la comunicación entre el cliente y el servidor fuera segura y que la autenticación con JWT funcionara correctamente requirió una cuidadosa validación y depuración.

**Gestión del tiempo:** Durante el desarrollo del proyecto, enfrentamos restricciones de tiempo debido a otras asignaciones y responsabilidades académicas. La limitación de tiempo nos dificultó dedicar el esfuerzo necesario para la investigación y desarrollo del proyecto, lo que influyó en el proceso de resolución de problemas y pruebas.

##**Conclusiones:**
Este proyecto ha demostrado la implementación de una API REST con Spring Boot y autenticación basada en JWT. La aplicación ofrece operaciones CRUD para gestionar autores y libros de una librería. A pesar de las complicaciones iniciales en la implementación de JWT, la investigación y la adaptación permitieron superar los desafíos y lograr una aplicación funcional y segura. La combinación de Spring Boot y JWT es una solución poderosa para desarrollar aplicaciones web seguras y eficientes.