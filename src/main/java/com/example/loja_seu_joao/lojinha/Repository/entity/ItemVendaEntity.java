package com.example.loja_seu_joao.lojinha.Repository.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "itemVenda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemVendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ItenVenda;

    @Column(name = "quatidade_venda_produto")
    private int quatidade_venda_produto;

    @Column(name = "preco_da_venda")
    private double preco_da_venda;

    @ManyToOne
    private ProdutoEntity produto;

    @ManyToOne
    private VendasEntity vendas;

}
