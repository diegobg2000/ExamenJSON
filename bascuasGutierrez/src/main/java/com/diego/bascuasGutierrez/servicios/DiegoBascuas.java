package com.diego.bascuasGutierrez.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.bascuasGutierrez.persona.Persona;
import com.diego.bascuasGutierrez.persona.PersonaDAO;

@Service
public class DiegoBascuas {
	
	@Autowired
	private PersonaDAO personaDAO;

	public void guardar(List<Persona> personas) {
//		Persona persona = new Persona();
//		for(int i =0; i< personas.size(); i++) {
//			personaDAO.save(personas.get(i).getClass());
//		}
		
		personaDAO.saveAll(personas);
	}
}
