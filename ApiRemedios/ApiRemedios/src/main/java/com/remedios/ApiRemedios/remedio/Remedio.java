package com.remedios.ApiRemedios.remedio;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Remedios") // ESSA CLASS VAI SER REPRESENTADA NUMA TABELA CUJO NOME É REMEDIO
@Entity(name = "remedio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)// VAI GERAR ID AUTOMATICAMENTE
	private Long id; // ID DA APLICAÇÃO E CONSEQUENTEMENTE CHAVE PRIMÁRIA
	private	String nome;
	@Enumerated(EnumType.STRING)
	private Via via;	
	private String lote;
	private	String quantidade;
	private	String validade;
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;
}
