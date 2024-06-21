# FORO HUB

API DESTINADA A RECIBIR PETICIONES REST DE UN CLIENTE REALCIONADAS CON LA FUNCIONALIDAD ESPECIFICA DE UN FORO WEB DONDE SE PUEDE REGISTRAR UN TÓPICO, ACTUALIZAR TÓPICO,ELIMINAR TÓPICO, LISTAR TÓPICO Y AUTENTICAR USUARIO COMO FUNCIONALIDADES SOLICITADAS, Y APOYANDOSE CON FUNCIONALIDADES ADICIONALES PARA POBLAR CATALOGOS: REGISTRAR CURSOS,LISTAR CURSOS, REGISTRAR RESPUESTA  

## Comenzando 🚀

### Pre-requisitos 📋

_IntelliJ o alternativa similar como IDE
_Insomnia o alternativa similar como Herramienta de pruebas de API
_MySQL o alternativa similar como Manejador de Base de Datos

```
Es importante considerar que el nombre de la base de datos es "database_forohub".
Los mensajes JSON utilizados para las pruebas:

JSON autenticación usuario
{
	"nombre":"karina.zermenio",
	"contrasena":"123456"
}
JSON registrar respuesta 
{
  "mensaje": "Paradigma de programacion sobre eleccion de soluciones tecnologicas",
  "topico_id": "1",
  "autor": "ElZorro"
}
JSON registrar curso
{
	"nombre":"RELACIONES INTERNACIONALES",
	"categoria":"AREA_3"
}
JSON registrar tópico
{
    "titulo": "Topico prueba",
    "mensaje": "No se puede realizar la indexacion de acuerdo con las instrucciones compartidas",
    "autor": "Calamardo",
    "curso": {
        "id": "2"
    }
}
```

### Instalación 🔧

Descarga el proyecto foro HUB en un .zip y desepaquetalo en la carpeta donde quieres situar tu proyecto ( carpeta de tu maquina local).

Abre el proyecto con IntelliJ
Verifica que las dependencias MAVEN se encuentren actualizadas
Abre MySQL y crea tu base de datos, tiene que existir el esquema, solamente el nombre, pero es importante que exista y este conectada antes de intentar correr la API, ya que la primera vez creara las tablas en base de datos
Es importante revisar que los mensajes/notificaciones de IntelliJ no marquen ningun error
Revisa el esquema de base de datos para verificar que se crearon correctamente tus Tablas y sus Columnas
El usuario en base de datos debe existir antes de probar Autenticar usuario


## Ejecutando las pruebas ⚙️

1. Autenticación: Desde Insomnia utilizar POST Autenticación para enviar usuario y contrasena, que deben de estar en la base de datos previamente.
Respuesta Esperada: Código 200
2. Registrar Tópico: Desde Insomnia utilizar POST Registrar Tópico para registrar en Base de Datos un tópico o entrada en el FORO
Respuesta Esperada:  Código 201
IMPORTANTE: considerar los datos validos para registro de tópico, debe existir un curso en base de datos
3. Listar Tópicos: Desde Insomnia utilizar el GET Listar Tópicos para recibir una lista de todos los tópicos
Respuesta Esperada: Código 200 mas la lista de los tópicos
4. Actualizar Tópico/Registrar Respuesta: Desde IntelliJ utilizar POST para registrar en Base de Datos una respuesta
Respuesta Esperada: Código 201 mas la información del mensaje y el tópico asociado al mensaje.
 
## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Construido con 🛠️

* [Maven](https://maven.apache.org/) - Manejador de dependencias

## Autores ✒️

* **Karina Zermeño ** - *Trabajo Inicial* - [Lilith3Kaos](https://github.com/Lilith3kaos)

## Consulta Doucumentación aute generada por Swagger ✒️
http://localhost:8080/swagger-ui/index.html
Nota: La aplicación debe estar funcionando para que se genere la documentación.




## Expresiones de Gratitud 🎁

Last but not least, I wanna thank me
---
