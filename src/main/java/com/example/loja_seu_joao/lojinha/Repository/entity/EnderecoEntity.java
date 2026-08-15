package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_endereco;

    @Column(name = "rua", length = 100)
    private String rua;

    @Column(name = "numero", length = 10)
    private int numero;

    @Column(name = "cep", length = 9)
    private String cep;

}
