package br.com.bytebank.banco.java.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedListEquals {
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();	
		// Utilizando LinkedLists ao inves de usar ArrayList
		
		ContaCorrente conta1 = new ContaCorrente(11, 21);
		ContaCorrente conta2 = new ContaCorrente(12, 21);
		ContaPoupanca conta3 = new ContaPoupanca(11, 21);
		
		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		
		//Maneira mais otimizada de se fazer um laço for sobre um array
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		boolean verifiacador = conta2.equals(conta3);
		System.out.println(verifiacador);
		
	}
}
