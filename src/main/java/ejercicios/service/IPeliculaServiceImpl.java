package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ejercicios.dto.Pelicula;

public class IPeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaService iPeliServ;
	
	@Override
	public List<Pelicula> listPelicula() {
		// TODO Auto-generated method stub
		return iPeliServ.listPelicula();
	}

	@Override
	public Pelicula peliculaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return iPeliServ.peliculaPorCodigo(codigo);
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliServ.savePelicula(pelicula);
	}

	@Override
	public Pelicula updatePelicula(int codigo, Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliServ.updatePelicula(codigo, pelicula);
	}

	@Override
	public void deletePelicula(int codigo) {
		// TODO Auto-generated method stub
		iPeliServ.deletePelicula(codigo);
	}

}
