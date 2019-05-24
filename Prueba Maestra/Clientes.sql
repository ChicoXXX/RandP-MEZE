create database Clientes;
use Clientes;


create table datos_generales(
id int auto_increment primary key,
nombres nvarchar(50),
apellidos nvarchar(50),
calle nvarchar(50),
numero int(50),
colonia nvarchar(50)
);
 
select * from datos_generales;

CREATE TABLE empresa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre NVARCHAR(50),
    direccion NVARCHAR(50),
    rfc NVARCHAR(50),
    telefono int(50)
);



select * from empresa;

