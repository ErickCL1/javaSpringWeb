package com.remedios.ApiRemedios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.ApiRemedios.remedio.DadosCadastroRemedios;
import com.remedios.ApiRemedios.remedio.Remedio;
import com.remedios.ApiRemedios.remedio.RemedioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody @Valid DadosCadastroRemedios dados) {
		repository.save(new Remedio(dados));
	}
	
}
 