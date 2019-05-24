/* Creamos la base datos */
create database NombreClientes;

/*Usamos la base de datos*/
use NombreClientes;

/*Creamos la primera tabla llamada DatosGenerales*/
create table DatosGenerales(
id INT auto_increment,primary key(id),
Nombres varchar (50),
Apellidos varchar (50),
Calle varchar (50),
Numero varchar (50),
Colonia varchar (50)
);

select * from DatosGenerales;

/*Creamos la segunda tabla llamada Empresa*/
create table Empresa(
id INT auto_increment,primary key(id),
Nombre varchar (50),
Direccion varchar (50),
RFC varchar (50),
Telefono varchar (50)
);

select *from Empresa;