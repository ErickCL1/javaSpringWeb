package com.remedios.ApiRemedios.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.ApiRemedios.remedio.DadosCadastroRemedios;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroRemedios dados) {
		System.out.println(dados);
	}
}
