package ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.dto.Sala;
import ejercicios.service.ISalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {

	private ISalaService salaServ;
	
	@GetMapping("/all")
    public List<Sala> lsitSala() {
    	
        return salaServ.listSala();
    }

    @PostMapping("/add")
    public Sala salvarDepartamento(@RequestBody Sala sala) {
    	
        return salaServ.saveSala(sala);
    }

    @GetMapping("/{codigo}")
    public Sala peliXID(@PathVariable(name = "codigo") Integer codigo) {
    	
    	Sala salaPorId = salaServ.salaPorCodigo(codigo);
        System.out.println("Sala XID: " + salaPorId);
        
        return salaPorId;
    }

    @PutMapping("/{codigo}")
    public Sala updateSala(@PathVariable(name = "codigo") Integer codigo, @RequestBody Sala sala) {
    	
    	Sala salaSeleccionada = salaServ.salaPorCodigo(codigo);
        salaSeleccionada.setNombre(sala.getNombre());
        salaSeleccionada.setCodigo(sala.getCodigo());
        salaSeleccionada.setPelicula(sala.getPelicula());
        
        return salaServ.udpateSala(codigo, salaSeleccionada);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarSala(@PathVariable(name = "codigo") Integer codigo) {
    	
    	salaServ.deleteSala(codigo);
        System.out.println("Sala eliminada");
    }
}
