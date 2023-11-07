package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ejercicios.dto.Sala;

public class ISalaServiceImpl implements ISalaService{

	@Autowired
	ISalaService iSalaServ;
	
	@Override
	public List<Sala> listSala() {
		// TODO Auto-generated method stub
		return iSalaServ.listSala();
	}

	@Override
	public Sala salaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return iSalaServ.salaPorCodigo(codigo);
	}

	@Override
	public Sala saveSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaServ.saveSala(sala);
	}

	@Override
	public Sala udpateSala(int codigo, Sala sala) {
		// TODO Auto-generated method stub
		return iSalaServ.udpateSala(codigo, sala);
	}

	@Override
	public void deleteSala(int codigo) {
		// TODO Auto-generated method stub
		iSalaServ.deleteSala(codigo);
	}

}
