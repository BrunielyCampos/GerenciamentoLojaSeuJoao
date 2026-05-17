package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table (name = "Estoque")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estoque;

    @Column(name = "qtd_produtos_Estoque")
    private int qtd_produtos_Estoque;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_produto", referencedColumnName = "id_estoque")
    private List<ProdutoEntity> produtosEntities;
}
