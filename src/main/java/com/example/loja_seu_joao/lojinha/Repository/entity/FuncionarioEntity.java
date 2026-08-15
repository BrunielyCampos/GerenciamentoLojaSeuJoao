package com.example.loja_seu_joao.lojinha.Repository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "Funcionario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Funcionario;

    @Column(name = "nomeFuncionario")
    private String nomeFuncionario;

    @Column(name = "numero_funci", length = 10)
    private String numeroFunci;

    @Column(name = "senha", length = 8)
    @NotBlank
    private String senha;

    @Column(name = "email")
    @Email
    private String email;
}
