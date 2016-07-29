create database if not exists db_agenda;

use db_agenda;

create table if not exists tb_contatos(
	con_id int not null auto_increment primary key,
    con_nome varchar(50) not null,
    con_fone varchar(11) not null
);

insert into tb_contatos (
	con_nome, con_fone
) values (
	"WESKLEY BEZERRA", "84996753679"
),(
	"CARLOS AUGUSTO", "84987183929"
);

select * from tb_contatos;