package com.example.loja_seu_joao.lojinha.Service;

import com.example.loja_seu_joao.lojinha.Model.Funcionario;
import com.example.loja_seu_joao.lojinha.Repository.Exceptions.ConflitException;
import com.example.loja_seu_joao.lojinha.Repository.FuncionarioRepository;
import com.example.loja_seu_joao.lojinha.Repository.entity.FuncionarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioEntity salvarFuncionário(FuncionarioEntity funcionario){
        try {
            emailExiste(funcionario.getEmail());
            funcionario.setSenha(funcionario.getSenha());
           return funcionarioRepository.save(funcionario);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void emailExiste(String email){
        try {
            boolean existe = verificarEmailExiste(email);

            if (existe){
                throw new ConflitException("[ERRO]:Email Já está Cadastrado!" + email);
            }

        } catch (ConflitException e){
            throw new ConflitException("[ERRO]:Email Já Está Cadastrado!" + e.getCause());

        }
    }

    public boolean verificarEmailExiste(String email){
       return funcionarioRepository.existsByEmail(email);
    }

}
