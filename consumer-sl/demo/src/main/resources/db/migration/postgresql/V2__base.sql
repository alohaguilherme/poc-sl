create table paises (
  id serial primary key,  
  name text
);


create table estados (
  id serial primary key,  
  i_pais integer not null references paises(id) ,
  name text not null,
  sigla char(2) not null
);

create table municipios (
  id serial primary key,  
  i_estados integer not null references estados(id),
  name text not null  
);

create table tipos_logradouros (
  id serial primary key,
  nome text,
  abreviacao char(1)
);

create table logradouros(
  id serial primary key,
  id_tipo integer not null references tipos_logradouros(id),
  id_municipio integer not null references municipios(id),
  cep integer,
  numero integer,
  nome text not null
);