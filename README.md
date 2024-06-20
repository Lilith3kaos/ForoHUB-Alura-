# FORO HUB

_API DESTINADA A RECIBIR PETICIONES REST DE UN CLIENTE REALCIONADAS CON LA FUNCIONALIDAD ESPECIFICA DE UN FORO WEB DONDE SE PUEDE REGISTRAR UN TÓPICO, ACTUALIZAR TÓPICO,ELIMINAR TÓPICO, LISTAR TÓPICO Y AUTENTICAR USUARIO COMO FUNCIONALIDADES SOLICITADAS, Y APOYANDOSE CON FUNCIONALIDADES ADICIONALES PARA POBLAR CATALOGOS: REGISTRAR CURSOS,LISTAR CURSOS, REGISTRAR RESPUESTA  _

## Comenzando 🚀

### Pre-requisitos 📋

_IntelliJ o alternativa similar como IDE_
_Insomnia o alternativa similar como Herramienta de pruebas de API_
_MySQL o alternativa similar como Manejador de Base de Datos_

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

_Descarga el proyecto foro HUB en un .zip y desepaquetalo en la carpeta donde quieres situar tu proyecto ( carpeta de tu maquina local)._

_Abre el proyecto con IntelliJ_
_Verifica que las dependencias MAVEN se encuentren actualizadas_
_Abre MySQL y crea tu base de datos, tiene que existir el esquema, solamente el nombre, pero es importante que exista y este conectada antes de intentar correr la API, ya que la primera vez creara las tablas en base de datos_
_Es importante revisar que los mensajes/notificaciones de IntelliJ no marquen ningun error_
_Revisa el esquema de base de datos para verificar que se crearon correctamente tus Tablas y sus Columnas_
_El usuario en base de datos debe existir antes de probar Autenticar usuario_


## Ejecutando las pruebas ⚙️

_PRUEBAS_
_1. Autenticación: Desde Insomnia utilizar POST Autenticación para enviar usuario y contrasena, que deben de estar en la base de datos previamente._
_Respuesta Esperada: Código 200_
_2. Registrar Tópico: Desde Insomnia utilizar POST Registrar Tópico para registrar en Base de Datos un tópico o entrada en el FORO_
_Respuesta Esperada:  Código 201_
_IMPORTANTE: considerar los datos validos para registro de tópico, debe existir un curso en base de datos_
_3. Listar Tópicos: Desde Insomnia utilizar el GET Listar Tópicos para recibir una lista de todos los tópicos_
_Respuesta Esperada: Código 200 mas la lista de los tópicos_
_4. Actualizar Tópico/Registrar Respuesta: Desde IntelliJ utilizar POST para registrar en Base de Datos una respuesta_
_Respuesta Esperada: Código 201 mas la información del mensaje y el tópico asociado al mensaje._
 
## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Construido con 🛠️

* [Maven](https://maven.apache.org/) - Manejador de dependencias

## Autores ✒️

* **Karina Zermeño ** - *Trabajo Inicial* - [Lilith3Kaos](https://github.com/Lilith3kaos)

## Expresiones de Gratitud 🎁

*Last but not least, I wanna thank me
---
