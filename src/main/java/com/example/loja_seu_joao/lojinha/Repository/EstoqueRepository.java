package com.example.loja_seu_joao.lojinha.Repository;

import com.example.loja_seu_joao.lojinha.Repository.entity.EstoqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<EstoqueEntity, Long> {
}
