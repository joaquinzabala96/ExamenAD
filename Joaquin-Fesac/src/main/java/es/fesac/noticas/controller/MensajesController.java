package es.fesac.noticas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.fesac.noticias.dao.MensajeRepository;
import es.fesac.noticias.model.Mensaje;

@Controller
public class MensajesController {
	 @Autowired
		MensajeRepository MensajeRepository;
	
	@GetMapping(path="/allMensaje")
	public @ResponseBody Iterable<Mensaje> getAllMensajes() {
		
		return MensajeRepository.findAll();
	}
	
}
