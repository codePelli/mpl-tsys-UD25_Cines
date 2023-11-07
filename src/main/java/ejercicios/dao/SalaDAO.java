package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Pelicula;
import ejercicios.dto.Sala;

public interface SalaDAO extends JpaRepository<Sala, Integer>{

}
