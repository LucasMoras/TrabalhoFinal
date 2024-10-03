create table tb_usuarios(
id_usuario int primary key,
usuario varchar(50) not null,
login varchar(50) not null unique,
senha varchar(15)not null
);
insert into tb_usuarios(id_usuario, usuario, login, senha)
values(1, 'UsuarioRoot', 'root', '123');
