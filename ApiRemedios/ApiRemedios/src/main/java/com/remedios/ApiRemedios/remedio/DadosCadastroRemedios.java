package com.remedios.ApiRemedios.remedio;

import java.time.LocalDate;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroRemedios(
		
		
		@NotBlank // evita aceitar dados em branco
		String nome,
		@Enumerated // pq é um ENUM
		Via via,
		@NotBlank
		String lote,
		
		int quantidade,
		
		@Future // só permite datas no futuro
		LocalDate validade,
		@Enumerated // pq é um ENUM
		Laboratorio laboratorio)
		
		
		{
	
}
