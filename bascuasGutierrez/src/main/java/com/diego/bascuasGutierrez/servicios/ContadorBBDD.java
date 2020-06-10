package com.diego.bascuasGutierrez.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diego.bascuasGutierrez.persona.PersonaDAO;

@Repository
public class ContadorBBDD {

	@Autowired
	private PersonaDAO personaDAO;
	
	public void contar() {
		
		long contador = personaDAO.count();
		
		System.out.println("Segun el servicio de contador en la BBDD hay --> " + contador + " elementos");
	}
}
