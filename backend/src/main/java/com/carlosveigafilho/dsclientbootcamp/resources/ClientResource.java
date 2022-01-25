package com.carlosveigafilho.dsclientbootcamp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlosveigafilho.dsclientbootcamp.entities.Client;
import com.carlosveigafilho.dsclientbootcamp.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> clientes = service.findAll();
		return ResponseEntity.ok().body(clientes);
	}
}
