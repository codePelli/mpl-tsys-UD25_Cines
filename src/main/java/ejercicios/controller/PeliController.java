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

import ejercicios.dto.Pelicula;
import ejercicios.service.IPeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliController {

	@Autowired
	private IPeliculaService iPeliServ;
	
	@GetMapping("/list")
    public List<Pelicula> listPeliculas() {
    	
        return iPeliServ.listPelicula();
    }

    @PostMapping("/add")
    public Pelicula salvarDepartamento(@RequestBody Pelicula peli) {
    	
        return iPeliServ.savePelicula(peli);
    }

    @GetMapping("/{codigo}")
    public Pelicula peliXID(@PathVariable(name = "codigo") Integer codigo) {
    	
    	Pelicula peliPorId = iPeliServ.peliculaPorCodigo(codigo);
        System.out.println("Peli XID: " + peliPorId);
        return peliPorId;
    }

    @PutMapping("/{codigo}")
    public Pelicula updatePeli(@PathVariable(name = "codigo") Integer codigo, @RequestBody Pelicula peli) {
    	
    	Pelicula peliSeleccionada = iPeliServ.peliculaPorCodigo(codigo);
        peliSeleccionada.setNombre(peli.getNombre());
        peliSeleccionada.setCodigo(peli.getCodigo());
        peliSeleccionada.setCalificacionEdad(peli.getCalificacionEdad());
        return iPeliServ.updatePelicula(peliSeleccionada);
    }

    @DeleteMapping("/{codigo}")
    public void deletePeli(@PathVariable(name = "codigo") Integer codigo) {
    	
    	iPeliServ.deletePelicula(codigo);
        System.out.println("Pelicula eliminada");
    }
}