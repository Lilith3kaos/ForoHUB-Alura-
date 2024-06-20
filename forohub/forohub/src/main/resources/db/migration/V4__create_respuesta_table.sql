CREATE TABLE respuestas (
    id bigint not null auto_increment,
    mensaje  varchar(255) not null,
    topico_id bigint not null,
    fecha_creacion datetime not null,
    autor varchar(50),

    primary key(id)

);
