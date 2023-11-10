package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import ejercicios.dao.PeliculaDAO;
import ejercicios.dto.Pelicula;

@Service
public class IPeliculaServiceImpl implements IPeliculaService{

	@Autowired
	@Lazy
	PeliculaDAO iPeliServ;
	
	@Override
	public List<Pelicula> listPelicula() {
		// TODO Auto-generated method stub
		return iPeliServ.findAll();
	}

	@Override
	public Pelicula peliculaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return iPeliServ.findById(codigo).get();
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliServ.save(pelicula);
	}

	@Override
	public Pelicula updatePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return iPeliServ.save(pelicula);
	}

	@Override
	public void deletePelicula(int codigo) {
		// TODO Auto-generated method stub
		iPeliServ.deleteById(codigo);
	}

}
