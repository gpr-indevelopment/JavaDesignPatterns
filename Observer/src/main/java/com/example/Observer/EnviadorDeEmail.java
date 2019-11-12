package com.example.Observer;

public class EnviadorDeEmail implements Acao {

    @Override
    public void executar(NotaFiscal nf) {
        System.out.println("Enviando email");
    }
}
