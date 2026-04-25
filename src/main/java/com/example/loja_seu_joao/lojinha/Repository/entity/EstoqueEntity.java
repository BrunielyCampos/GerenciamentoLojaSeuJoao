package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "estoque")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estoque;

    @Column(name = "nomeItensArmazenados")
    private String nomeIntensArmazenados;

    @Column(name = "nomeItem")
    @NotBlank
    private String nomeItem;

    @Column(name = "qtd_Itens_Estoque")
    private int qtd_Itens_Estoque;

}
