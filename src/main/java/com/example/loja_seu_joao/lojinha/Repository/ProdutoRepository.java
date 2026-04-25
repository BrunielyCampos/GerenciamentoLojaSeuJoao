package com.example.loja_seu_joao.lojinha.Repository;

import com.example.loja_seu_joao.lojinha.Repository.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

}
