create database trabalhoNp2;

use trabalhoNp2;

create table profissionais(
id int primary key auto_increment,
nome varchar(250) not null,
cpf varchar(14) not null unique,
nascimento date not null,
cargo varchar(12) not null);

create table pacientes(
cartao_sus varchar(20) primary key,
nome varchar(250) not null,
cpf varchar(14) unique,
nascimento date not null,
cor varchar(15) not null,
deficiencia varchar(15) not null,
sexo varchar(15) not null,
rg varchar(20) not null unique,
rua varchar(180) not null,
bairro varchar(180) not null,
numero varchar(11) not null,
complemento varchar(150),
cidade varchar(100) not null,
estado varchar(2) not null,
ddd varchar(6) not null,
telefone varchar(20) not null,
escola varchar(140),
naturalidade varchar (30) not null,
profissao varchar (30) not null);

insert into pacientes values ('123 1298 9934 1234',
'Victor',
'374.512.321-79',
'1996-09-02',
'Branca',
'NA',
'Masculino',
'555004806',
'Rua Um dois tres',
'Centro',
'11',
'NA',
'Campinas',
'SP',
'19',
'998297632',
'UNIP',
'Campinas',
'Estudante');

create table medicos(
crm varchar(16) primary key,
id_profissionais int not null,
area_especializacao varchar(150) not null,
foreign key (id_profissionais) references profissionais(id));

create table consulta(
id int primary key auto_increment,
crm_medico varchar(16),
cartao_sus_pacientes varchar(20),
data date not null,
cstatus tinyint not null,
urgencia tinyint not null,
receita varchar(400),
diagnostico varchar(400),
foreign key (cartao_sus_pacientes) references pacientes(cartao_sus),
foreign key (crm_medico) references medicos(crm));

insert into profissionais (nome,cpf,nascimento,cargo) values 
("Guilherme Pupo Cardoso", "pupo", "1997-03-28", "atendente"),
("Ed Willy", "ed", "1999-05-17", "médico"),
("Victor Tortelli", "vitao", "1997-08-18", "farmacêutico");

insert into medicos(crm,id_profissionais,area_especializacao) values
("12345678-9/BR", 2, "urologia");

CREATE USER 'pupo'@'localhost' IDENTIFIED BY 'thegreat';
grant select,insert,update,delete on trabalhoNp2.* to pupo@localhost;

CREATE USER 'ed'@'localhost' IDENTIFIED BY 'willy';
grant select,insert,update,delete on trabalhoNp2.* to ed@localhost;


CREATE USER 'vitao'@'localhost' IDENTIFIED BY 'victor';
grant select on trabalhoNp2.* to vitao@localhost;

-- select * from consulta;
 select * from pacientes;
 
 UPDATE pacientes SET nome = 'Guilherme', nascimento = '1996-9-2' WHERE cartao_sus = '616 1616 5151 3212';
 


-- insert into teste values (CURDATE(), CURTIME(), NOW());

-- drop database trabalhoNp2;

-- se nao quiser apagar a table consulta só da esse alter table que ta tudo certo
-- alter table consulta add diagnosticos varchar(400);
-- alter table pacientes add (naturalidade varchar(30), profissao varchar(30));

 -- select c.id, p.nome,p.cartao_sus,p.nascimento,c.urgencia  from consulta c, pacientes p where c.cartao_sus_pacientes = p.cartao_sus AND c.cstatus = 2 order by c.id AND c.urgencia;

