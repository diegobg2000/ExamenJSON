package com.diego.bascuasGutierrez.persona;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diego.bascuasGutierrez.aula.ApiRestAula;
import com.diego.bascuasGutierrez.aula.Aula;
import com.diego.bascuasGutierrez.servicios.ContadorBBDD;
import com.diego.bascuasGutierrez.servicios.DiegoBascuas;
import com.diego.bascuasGutierrez.servicios.ServicioREST;

@RestController
public class PersonaApiRest {
	
	@Autowired 
	private DiegoBascuas diegoBascuas;
	
	@Autowired
	private ServicioREST servicioRest;
	
	@Autowired
	private ContadorBBDD contadorBBDD;
	
	@PutMapping("/json/add")
	public ResponseEntity<Aula> json(@RequestBody Aula aula){
		
		diegoBascuas.guardar(aula.getPersonas());
		
		try {
			servicioRest.enviarAula(aula);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contadorBBDD.contar();
		
		return new ResponseEntity<Aula>(aula, HttpStatus.OK);
		
	}

}
