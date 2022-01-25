package com.carlosveigafilho.dsclientbootcamp.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlosveigafilho.dsclientbootcamp.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> clientes = new ArrayList<>();
		clientes.add(new Client(1L, "Carlos", "12345678900", 4500.00, Instant.now(), 2));
		clientes.add(new Client(2L, "Maria", "32145678900", 5500.00, Instant.now(), 1));
		clientes.add(new Client(3L, "Joana", "65432178900", 3500.00, Instant.now(), 0));
		return ResponseEntity.ok().body(clientes);
	}
}
