package com.example.Observer;

public class EnviadorDeSMS implements Acao {

    @Override
    public void executar(NotaFiscal nf) {
        System.out.println("Enviando SMS");
    }
}
