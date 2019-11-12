package com.example.Observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ObserverTest {

	public static void main(String[] args) {
		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		notaFiscalBuilder.paraEmpresa("Casas Bahia")
				.comCnpj("123456")
				.com(new Item("TestItem", 2))
				.comObservacoes("Test observações")
				.com(Arrays.asList(new EnviadorDeEmail(), new EnviadorDeSMS(), new NotaFiscalDAO(), new Impressora(), new Multiplicador(3)));
		NotaFiscal nf = notaFiscalBuilder.constroi();
	}

}
