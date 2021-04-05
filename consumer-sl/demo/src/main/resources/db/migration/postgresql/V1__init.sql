create table databases(
  id serial primary key,
  nome text
);

create table entidades (
  id serial,
  i_database integer not null references databases(id),
  nome text,
  primary key (id, i_database)
);