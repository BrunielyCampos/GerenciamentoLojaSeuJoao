package com.example.loja_seu_joao.lojinha.Repository;

import com.example.loja_seu_joao.lojinha.Repository.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
