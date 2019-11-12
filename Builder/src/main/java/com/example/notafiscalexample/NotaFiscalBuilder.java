package com.example.notafiscalexample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;

    private String cnpj;

    private List<Item> todosItens = new ArrayList<>();

    private double valorBruto;

    private double impostos;

    private String observacoes;

    private Calendar data = Calendar.getInstance();

    public NotaFiscalBuilder paraEmpresa(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder com(Item item){
        todosItens.add(item);
        this.valorBruto += item.getValor();
        this.impostos += item.getValor()*0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes){
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naData(Calendar calendar){
        this.data = calendar;
        return this;
    }

    public NotaFiscal constroi(){
        return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
    }
}
