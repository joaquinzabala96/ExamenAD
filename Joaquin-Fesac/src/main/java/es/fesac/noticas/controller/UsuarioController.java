package es.fesac.noticas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fesac.noticias.dao.UsuarioRepository;
import es.fesac.noticias.model.Usuario;
import es.fesac.noticias.model.beans.LoginBean;

@Controller
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	private HttpSession httpSession;
	
	@PostMapping(value="/login")
	public String validarLogin(@ModelAttribute("userLogin")LoginBean loginBean, Model model) 
	{
		Usuario u = usuarioRepository.getByEmailAndPassword(loginBean.getEmail(), loginBean.getPassword());
		
		if(u != null) {
			httpSession.setAttribute("userLoggedIn",u);
			return "redirect:/";
	}
		else{
			model.addAttribute("userLogin", loginBean);
			model.addAttribute("error", "Error al validar");
			return "login";
		}
		
	}
}
