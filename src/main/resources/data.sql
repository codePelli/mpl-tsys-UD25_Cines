drop database if exists ud14_ejercicio06;
create database if not exists ud14_ejercicio06;
use ud14_ejercicio06;

CREATE TABLE peliculas (
    codigo INT PRIMARY KEY,
    nombre NVARCHAR(100),
    calificacion_edad INT
);

CREATE TABLE salas (
    codigo INT PRIMARY KEY,
    nombre NVARCHAR(100),
    pelicula INT,
    FOREIGN KEY (pelicula)
        REFERENCES Peliculas (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Peliculas (codigo, nombre, calificacion_edad) VALUES (1, 'Pelicula1', 12);
INSERT INTO Peliculas (codigo, nombre, calificacion_edad) VALUES (2, 'Pelicula2', 18);
INSERT INTO Salas (codigo, nombre, pelicula) VALUES (101, 'Sala1', 1);
INSERT INTO Salas (codigo, nombre, pelicula) VALUES (102, 'Sala2', 2);