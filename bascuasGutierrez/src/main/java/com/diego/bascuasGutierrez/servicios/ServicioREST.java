package com.diego.bascuasGutierrez.servicios;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.diego.bascuasGutierrez.aula.Aula;


@Service
public class ServicioREST {

	public void enviarAula(Aula aula) throws URISyntaxException {
			
			URI myURL = new URI("http://localhost:9090/direccion/rest");
			
			RequestEntity<Aula> request = new RequestEntity<Aula>(aula,HttpMethod.POST, myURL);
	
			RestTemplate restTemplate = new RestTemplate();
			
			restTemplate.exchange(request,Aula.class); 		
	
	}
}
