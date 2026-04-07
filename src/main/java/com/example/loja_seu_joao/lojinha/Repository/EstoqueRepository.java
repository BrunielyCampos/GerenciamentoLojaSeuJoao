package com.example.loja_seu_joao.lojinha.Repository;

import com.example.loja_seu_joao.lojinha.Model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
