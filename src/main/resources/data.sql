DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

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
        REFERENCES peliculas (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas (codigo, nombre, calificacion_edad) VALUES (1, 'Pelicula1', 12);
INSERT INTO peliculas (codigo, nombre, calificacion_edad) VALUES (2, 'Pelicula2', 18);
INSERT INTO salas (codigo, nombre, pelicula) VALUES (101, 'Sala1', 1);
INSERT INTO salas (codigo, nombre, pelicula) VALUES (102, 'Sala2', 2);