package com.example.Observer;

public class NotaFiscalDAO implements Acao {

    @Override
    public void executar(NotaFiscal nf) {
        System.out.println("Salvando no Banco");
    }
}
