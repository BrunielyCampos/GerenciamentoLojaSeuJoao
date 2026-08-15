package com.example.loja_seu_joao.lojinha.Repository.Exceptions;

public class ConflitException extends RuntimeException {
    public ConflitException(String message) {
        super(message);
    }

    public ConflitException(String messagem, Throwable throwable){
          super(messagem);
    }

}
