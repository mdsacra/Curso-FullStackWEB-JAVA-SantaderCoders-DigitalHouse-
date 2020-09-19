package com.example.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cadastro.model.Cliente;
import com.example.cadastro.repository.ClienteRepository;

@CrossOrigin
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;
	
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		
		return repository.save(cliente);
	}
	
}
