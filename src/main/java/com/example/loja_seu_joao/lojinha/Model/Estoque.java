package com.example.loja_seu_joao.lojinha.Model;


public class Estoque {

    private String nome_Produto;
    private Double preco;
    private Integer quantidade_Disponivel;

    public Estoque(String nomeP, Double preco, Integer qtdDisp){
        this.nome_Produto = nomeP;
        this.preco = preco;
        this.quantidade_Disponivel = qtdDisp;
        validarEstoque();
    }

    public void validarEstoque(){
        if(nome_Produto == null || nome_Produto.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do produto invalido!");
        }

        if (preco == null || preco <= 0){
            throw new IllegalArgumentException("Preço Invalido!");
        }

        if(quantidade_Disponivel == null){
            throw new IllegalArgumentException("A quantidade Não pode estar Vazia!");
        }

    }

}