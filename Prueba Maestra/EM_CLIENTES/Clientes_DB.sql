/*creacion de la BD*/
create database clientes;
/*para usar la BD*/
use clientes;


create table Generales (
id INT auto_increment, primary key(id),
Nombre varchar (20),
Apellido varchar (40),
Calle varchar (20),
Colonia varchar (20),
Telefono nvarchar (20)
);
select * from Generales;

/*insertar elementos dentro de nuestra tabla*/
insert into Generales (Nombre,Apellido,Calle,Colonia,Telefono) 
values ('Angel','Garcia','Africa','Las Etnias','8712193857');





create table Empresa (
id INT auto_increment, primary key(id),
Nombre varchar (20),
Direccion nvarchar (50),
RFC nvarchar (50),
Telefono nvarchar (20)
);

/*insertar elementos dentro de nuestra tabla*/
insert into Empresa (Nombre,Direccion,RFC,Telefono) 
values ('LALA','las rosas','12as36as45as','8712193857');
