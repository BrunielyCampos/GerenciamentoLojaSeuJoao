package com.example.loja_seu_joao.lojinha.Repository;

import com.example.loja_seu_joao.lojinha.Repository.entity.LojaEntity;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LojaRepository extends JpaRepository<LojaEntity, Long> {

}
