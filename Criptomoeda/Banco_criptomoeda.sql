Create database criptomoeda;
use criptomoeda ;

create table login(
id_login int not null auto_increment,
nome varchar(50) not null,
senha varchar(50) not null,
primary key (id_login));

insert into login(nome,senha)values("admin","admin123");

create table criptomoeda(
id_criptomoeda int not null auto_increment,
valor varchar(30),
primary key(id_criptomoeda));

insert into criptomoeda(valor)values("4.22");

create table ranking(
id_ranking int not null auto_increment,
nome varchar(50) not null,
valor varchar(50) not null,
primary key(id_ranking));

select nome,valor from Ranking order by convert(replace(valor,'.',''),decimal) desc 


