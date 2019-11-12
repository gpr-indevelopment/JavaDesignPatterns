package com.example.notafiscalexample;

public class BuilderTest {

	public static void main(String[] args) {
		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		notaFiscalBuilder.paraEmpresa("Casas Bahia")
				.comCnpj("123456")
				.com(new Item("TestItem", 123))
				.comObservacoes("Test observações");
		NotaFiscal nf = notaFiscalBuilder.constroi();
		System.out.println(nf.getCnpj());
		System.out.println(nf.getDataDeEmissao().getTime());
		System.out.println(nf.getImpostos());
		System.out.println(nf.getObservacoes());
		System.out.println(nf.getRazaoSocial());
	}
}
