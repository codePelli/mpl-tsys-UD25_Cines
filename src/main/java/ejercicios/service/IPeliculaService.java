package ejercicios.service;

import java.util.List;

import ejercicios.dto.Pelicula;

public interface IPeliculaService {
	
	List<Pelicula> listPelicula();
	
	Pelicula peliculaPorCodigo(int codigo);
	
	Pelicula savePelicula(Pelicula pelicula);
	
	Pelicula updatePelicula(Pelicula pelicula);
	
	void deletePelicula(int codigo);
}
