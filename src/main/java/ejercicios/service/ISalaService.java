package ejercicios.service;

import java.util.List;

import ejercicios.dto.Sala;

public interface ISalaService {
	
	List<Sala> listSala();
	
	Sala salaPorCodigo(int codigo);
	
	Sala saveSala(Sala sala);
	
	Sala udpateSala(int codigo, Sala sala);
	
	void deleteSala(int codigo);

}
