CREATE DATABASE Clientes;

USE Clientes;

CREATE TABLE Datos_Generales(
ID INT AUTO_INCREMENT PRIMARY KEY,
Nombres VARCHAR (25) NOT NULL,
Apellidos VARCHAR (25) NOT NULL,
Calle VARCHAR (20) NOT NULL,
Numero INT (5) NOT NULL,
Colonia NVARCHAR (20) NOT NULL
);

CREATE TABLE Empresa(
ID INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR (30) NOT NULL,
Direccion NVARCHAR (40) NOT NULL,
RFC NVARCHAR(25) NOT NULL,
Telefono INT (10) NOT NULL
);
select * from Datos_Generales;
INSERT INTO Datos_Generales(Nombres,Apellidos, Calle, Numero, Colonia) VALUES ('José','Castro', 'Los Angeles', 755, 'La Rosita');