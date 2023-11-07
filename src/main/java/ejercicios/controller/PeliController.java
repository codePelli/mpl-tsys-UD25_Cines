package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.service.IPeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliController {

	@Autowired
	private IPeliculaService iPeliServ;
}
