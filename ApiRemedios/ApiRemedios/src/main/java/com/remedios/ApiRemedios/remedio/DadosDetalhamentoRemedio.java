package com.remedios.ApiRemedios.remedio;

import java.time.LocalDate;

public record DadosDetalhamentoRemedio(Long id, String nome, Via via, int quantidade, LocalDate validade, Laboratorio laboratorio,
		Boolean ativo) {
	
	public DadosDetalhamentoRemedio(Remedio remedio) {
		this(remedio.getId(), remedio.getNome(), remedio.getVia(), remedio.getQuantidade(), remedio.getValidade(), remedio.getLaboratorio(),
				remedio.getAtivo());
	}
}
