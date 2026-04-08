package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Funcionario")
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Funcionario;

    private String nomeFuncionario;

    private double numeroFuncionario;
}
