# TrabalhoFinal
Integrantes do grupo: Lucas Moras e Matheus Oliveira.

# Documentação
Sobre o projeto:

O código é feito em Java,e consiste em um programa para marcar compromissos (como uma agenda) e gerenciciar os usuários e clientes, após criarem seu cadastro. A agenda possui data, hora e assunto (do cliente), fora às demais especificações,há também às credencias dos respectivos clientes, como: Id, nome, endereço, número de telefone, email, CPF e CNPJ.

Instruções de execução: 

Para executar o projeto precisamos ter o Netbeans entre as versões 8.2 ou a mais recente instalado em uma maquina com Windows, Linux ou MacOS. Clonando o código e abrindo-o no programa devemos colocar o arquivo jar de conexão na biblioteca do projeto, cujo o nome é mysql-connector-j-9.0.0, que serve para estabelecer conexão com o banco de dados. Cola-se os comandos no banco e execute o projeto, após a execução use o usuario e senha de perfil root nos campos de login para ter acesso e passar a usar.

Código MySQL:

create database trabalhofinal;

use trabalhofinal;

create table tb_usuarios(
id_usuario int primary key,
usuario varchar(50) not null,
login varchar(50) not null unique,
senha varchar(15)not null,
perfil varchar(10)not null
);

insert into tb_usuarios(id_usuario, usuario, login, senha, perfil)
values(1, 'Nome qualquer', 'root', '123', 'admin');

create table tb_clientes(
id_cliente int primary key,
cliente varchar(50) not null,
endereco varchar(50) not null unique,
telefone varchar(30) not null,
email varchar(50) not null,
cpf varchar(11) not null,
cnpj(14) not null
);
