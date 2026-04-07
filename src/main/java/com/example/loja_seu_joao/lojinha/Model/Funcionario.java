package com.example.loja_seu_joao.lojinha.Model;

public class Funcionario {

    private String nome;
    private String telefone;
    private int idade;

    public Funcionario(String nome, String telefone, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        validar();
    }

    public void validar(){
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome Invalido!");
        }

        if (telefone == null || telefone.trim().isEmpty()){
            throw new IllegalArgumentException("Telefone Invalido!");
        }

        if (idade == 16 || idade > 18){
            throw new IllegalArgumentException("Idade invalida!");
        }
    }
}