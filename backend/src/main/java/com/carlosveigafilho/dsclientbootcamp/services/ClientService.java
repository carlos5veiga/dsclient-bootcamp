package com.carlosveigafilho.dsclientbootcamp.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlosveigafilho.dsclientbootcamp.dto.ClientDTO;
import com.carlosveigafilho.dsclientbootcamp.entities.Client;
import com.carlosveigafilho.dsclientbootcamp.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly=true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		return list.stream().map(obj -> new ClientDTO(obj)).collect(Collectors.toList());
	}

	@Transactional
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		return new ClientDTO(obj.get());
		
	}
}
