create database trabalhoNp2;

use trabalhoNp2;

create table profissionais(
id int primary key auto_increment,
nome varchar(250) not null,
cpf varchar(14) not null,
nascimento date not null,
cargo varchar(250) not null);

create table pacientes(
cartao_sus varchar(20) primary key,
nome varchar(250) not null,
cpf varchar(14),
nascimento date not null,
cor varchar(15) not null,
deficiencia varchar(15) not null,
sexo varchar(15) not null,
rg varchar(20) not null,
rua varchar(180) not null,
bairro varchar(180) not null,
numero varchar(11) not null,
complemento varchar(150),
cidade varchar(100) not null,
estado varchar(2) not null,
ddd varchar(6) not null,
telefone varchar(20) not null,
escola varchar(140));

create table medicos(
crm varchar(16) primary key,
id_profissionais int not null,
area_especializacao varchar(150) not null,
foreign key (id_profissionais) references profissionais(id));

create table consulta(
id int primary key auto_increment,
crm_medico varchar(16),
cartao_sus_pacientes varchar(20),
data_consulta date not null,
hora_consulta time not null,
cstatus tinyint not null,
foreign key (cartao_sus_pacientes) references pacientes(cartao_sus),
foreign key (crm_medico) references medicos(crm));


