package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "Produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produto;

    @Column(name = "nome_produto")
    @NotBlank
    private String nome_produto;

    @Column(name = "preco_varejo")
    @NotNull
    private double preco_varejo;

    @Column(name = "preco_loja")
    @NotNull
    private double preco_loja;

    @ManyToOne
    @JoinColumn(name = "loja_id")
    private LojaEntity loja;

    @ManyToOne
    @JoinColumn(name = "id_estoque")
    private EstoqueEntity estoque;
}
