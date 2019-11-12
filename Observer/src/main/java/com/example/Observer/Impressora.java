package com.example.Observer;

public class Impressora implements Acao {

    @Override
    public void executar(NotaFiscal nf) {
        System.out.println("Imprimindo NF");
    }
}
