package com.gomes.notificao.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
@Data
public class Usuario {


    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private Double renda;
    private Proposta proposta;
}
