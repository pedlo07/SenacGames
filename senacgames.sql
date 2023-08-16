create database senacGames;
use senacGames;

create table game(
id bigint primary key auto_increment,
title varchar(250) not null,
genre varchar (255) not null
);

insert into game (title, genre) values ("Fifa","Emulador");

insert into game (title, genre) values ("Need For Speed","Corrida");

select * from game;

UPDATE mysql.user
    SET authentication_string = PASSWORD('root'), password_expired = 'N'
    WHERE User = 'Administrador' AND Host = 'localhost';
FLUSH PRIVILEGES;
