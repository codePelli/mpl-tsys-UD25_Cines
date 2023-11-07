package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Pelicula;

public interface PeliculaDAO extends JpaRepository<Pelicula, Integer>{

}
