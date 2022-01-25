package com.carlosveigafilho.dsclientbootcamp.services;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosveigafilho.dsclientbootcamp.entities.Client;
import com.carlosveigafilho.dsclientbootcamp.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll(){
		System.out.println(Instant.now());
		return repository.findAll();
	}
}
