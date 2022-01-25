package com.carlosveigafilho.dsclientbootcamp.services;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlosveigafilho.dsclientbootcamp.entities.Client;
import com.carlosveigafilho.dsclientbootcamp.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly=true)
	public List<Client> findAll(){
		return repository.findAll();
	}
}
