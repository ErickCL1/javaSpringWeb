package com.remedios.ApiRemedios.remedio;


import jakarta.validation.constraints.NotNull;

public record DadosAtualizarRemedios(@NotNull Long id, String nome, Via via, Laboratorio laboratorio) {

}
