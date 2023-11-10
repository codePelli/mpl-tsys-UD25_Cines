package ejercicios.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import ejercicios.dao.SalaDAO;
import ejercicios.dto.Sala;

@Service
public class ISalaServiceImpl implements ISalaService{

	@Autowired
	@Lazy
	SalaDAO iSalaServ;
	
	@Override
	public List<Sala> listSala() {
		// TODO Auto-generated method stub
		return iSalaServ.findAll();
	}

	@Override
	public Sala salaPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return iSalaServ.findById(codigo).get();
	}

	@Override
	public Sala saveSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaServ.save(sala);
	}

	@Override
	public Sala udpateSala(Sala sala) {
		// TODO Auto-generated method stub
		return iSalaServ.save(sala);
	}

	@Override
	public void deleteSala(int codigo) {
		// TODO Auto-generated method stub
		iSalaServ.deleteById(codigo);
	}

}
