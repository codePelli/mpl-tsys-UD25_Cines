package ejercicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.service.ISalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {

	@Autowired
	private ISalaService salaServ;
}
