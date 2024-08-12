create table if not exists tb_jad_sphere_users (
    id bigint not null auto_increment,
    name varchar(255),
    bio varchar(255),
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime,
    primary key (id)
);