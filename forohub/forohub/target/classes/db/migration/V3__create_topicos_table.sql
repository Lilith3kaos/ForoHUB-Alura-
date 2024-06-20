CREATE TABLE topicos (

    id bigint not null auto_increment,
    titulo varchar(30) not null,
    mensaje varchar(255) not null,
    fecha_creacion datetime not null,
    curso_id bigint,
    autor varchar(50),
    respuesta_id bigint,

    primary key(id)

);
