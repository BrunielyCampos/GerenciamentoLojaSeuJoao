package com.example.loja_seu_joao.lojinha.Model;

public class Loja {
    private String nome;
    private String cnpj;

    public Loja(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;

        validar();
    }

    public void validar(){
        if (cnpj == null || cnpj.trim().isEmpty()){
            throw new IllegalArgumentException("CNPJ Invalido!");
        }
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome da loja Invalido!");
        }
    }
}
