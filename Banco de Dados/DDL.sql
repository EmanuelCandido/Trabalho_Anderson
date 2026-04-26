create table professor(
id_professor serial primary key,
nome varchar (100) not null,
Especialidade varchar (100)not null,
);

create table caso_clinico(
id_casoclinico serial primary key,
titulo varchar (200)not null,
descricao text not null,
id_professor int,
constraint fk_professor foreign key (id_professor) references professor(id_professor)
);

create table pergunta(
id_pergunta serial primary key,
enunciado text,
id_casoclinico int,
constraint fk_casoclinico foreign key (id_casoclinico) references caso_clinico(id_casoclinico)
);