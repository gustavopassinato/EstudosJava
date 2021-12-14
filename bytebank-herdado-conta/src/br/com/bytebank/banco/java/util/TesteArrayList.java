package br.com.bytebank.banco.java.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();	//Uso de Generics para travar o Array
		//Maneira mais moderna de usar Generics
		// ainda é possível passr como parametro o comprimento desejado para a lista
		
		ContaCorrente conta1 = new ContaCorrente(11, 23);
		ContaCorrente conta2 = new ContaCorrente(11, 21);
		
		lista.add(conta1);
		lista.add(conta2);
		
		//Maneira mais otimizada de se fazer um laço for sobre um array
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}
