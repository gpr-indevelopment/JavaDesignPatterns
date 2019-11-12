package com.example.Observer;

public class Multiplicador implements Acao {

    private final double multiplicador;

    public Multiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public void executar(NotaFiscal nf) {
        System.out.println(nf.getValorBruto()*multiplicador);
    }
}
