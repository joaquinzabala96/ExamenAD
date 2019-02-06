package es.fesac.noticas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import es.fesac.noticias.model.Usuario;
import es.fesac.noticias.dao.MensajeRepository;
import es.fesac.noticias.dao.UsuarioRepository;
import es.fesac.noticias.model.Mensaje;

@Controller
public class AdminController {
	 @Autowired
		MensajeRepository MensajeRepository;
	    UsuarioRepository UsuarioRepository;
	
	 @GetMapping(value="/allUserandComment")
	public String todo(Model model) {
		
		Iterable<Mensaje> mensajes= MensajeRepository.findAll();
		model.addAttribute("mensajesList",mensajes);
		
		Iterable<Usuario> usuarios = UsuarioRepository.findAll();
		model.addAttribute("usuarioList", usuarios);

		return "index";}
}
