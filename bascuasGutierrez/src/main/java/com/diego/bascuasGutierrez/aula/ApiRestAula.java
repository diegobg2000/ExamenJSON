package com.diego.bascuasGutierrez.aula;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestAula {
	
	@PostMapping("/direccion/rest")
	public ResponseEntity<Aula> sysoAula(@RequestBody Aula aula){
		
	System.out.println("Aula lleganda mediante el mircroservicio --> "+ aula);
		
		
		return new ResponseEntity<Aula>(aula, HttpStatus.OK);
	}

}
