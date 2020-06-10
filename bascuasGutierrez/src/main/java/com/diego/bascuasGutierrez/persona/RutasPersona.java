package com.diego.bascuasGutierrez.persona;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.diego.bascuasGutierrez.servicios.ContadorBBDD;

@Controller
public class RutasPersona {

	@Autowired
	private PersonaDAO personaDAO;
	
	
	@Autowired
	private ContadorBBDD contadorBBDD;
	
	
	@GetMapping("/datos/add")
	public ModelAndView formulario() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("formulario.html");
		
		mav.addObject("persona", new Persona());
		
		return mav;
	}
	
	@PostMapping("datos/add/post")
	public ModelAndView postPersona(@Valid @ModelAttribute("persona") Persona persona,
			BindingResult bindingResult) {
		
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			
			mav.setViewName("formulario.html");

		}else {
			
			personaDAO.save(persona);
			contadorBBDD.contar();
			mav.setViewName("redirect:/datos/add");
			
		}
		
		
		
		return mav;
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable String id) {
		
		ModelAndView mav = new ModelAndView();
		
		Optional<Persona> persona = personaDAO.findById(id);
		
		if(persona.isPresent()) {
			
			personaDAO.deleteById(id);
			contadorBBDD.contar();
			mav.setViewName("encontrado.html");
		
		}else {
			
			Persona personaNotFound = new Persona();
			personaNotFound.setIdPersona(id);
			
			mav.addObject("persona", personaNotFound);	
			
			mav.setViewName("noEncontrado.html");
			
		}
		
		
		
		return mav;
	}
	
	
}
