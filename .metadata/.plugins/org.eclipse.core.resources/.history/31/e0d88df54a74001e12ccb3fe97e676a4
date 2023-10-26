package com.remedios.ApiRemedios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.remedios.ApiRemedios.remedio.DadosAtualizarRemedios;
import com.remedios.ApiRemedios.remedio.DadosCadastroRemedios;
import com.remedios.ApiRemedios.remedio.DadosDetalhamentoRemedio;
import com.remedios.ApiRemedios.remedio.DadosListagemRemedio;
import com.remedios.ApiRemedios.remedio.Remedio;
import com.remedios.ApiRemedios.remedio.RemedioRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/remedios")
public class RemedioController {
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	@Transactional 
	public ResponseEntity<DadosDetalhamentoRemedio> cadastrar(@RequestBody @Valid DadosCadastroRemedios dados, 
			UriComponentsBuilder uriBuilder) {
		var remedio = new Remedio(dados);
		repository.save(remedio);
		
		var uri = uriBuilder.path("/remedios/{id}").buildAndExpand(remedio.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new DadosDetalhamentoRemedio(remedio));
		
		
		
	}
	
	@GetMapping  // 204 NO CONTENT
	public ResponseEntity<List<DadosListagemRemedio>> Listar(){
		var lista = repository.findAllByAtivoTrue().stream().map(DadosListagemRemedio::new).toList();
		return ResponseEntity.ok(lista);
		
	}
	
	@PutMapping  // 204 NO CONTENT
	@Transactional
	public ResponseEntity<DadosDetalhamentoRemedio> atualizar(@RequestBody @Valid DadosAtualizarRemedios dados) {
		var remedio = repository.getReferenceById(dados.id());
		remedio.atualizarInformacoes(dados);
		return ResponseEntity.ok(new DadosDetalhamentoRemedio(remedio));
	}
	
	@DeleteMapping("/{id}") // 204 NO CONTENT
	@Transactional
	public ResponseEntity<Void> excluir(@PathVariable Long id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("inativar/{id}") // 204 NO CONTENT
	@Transactional
	public ResponseEntity<Void> inativar (@PathVariable Long id) {
		var remedio = repository.getReferenceById(id);
		remedio.inativar();
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("ativar/{id}")    // 204 NO CONTENT
	@Transactional
	public ResponseEntity<Void> ativar (@PathVariable Long id) {
		var remedio = repository.getReferenceById(id);
		remedio.ativar();
		return ResponseEntity.noContent().build();
	}
	
}
 