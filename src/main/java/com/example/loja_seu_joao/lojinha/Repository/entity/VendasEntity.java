package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Vendas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vendas;

    private String nome_cliente;

    private ProdutoEntity produto;
}
