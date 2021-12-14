package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		// Criando uma conta corrente
		
		ContaCorrente novaContaCorrente = new ContaCorrente(1234, 4321);
		novaContaCorrente.deposita(5000.0);
		
		ContaPoupanca novaContaPoupanca = new ContaPoupanca(1111, 1111);
		novaContaPoupanca.deposita(3000.0);
		
		try {
			novaContaCorrente.transfere(5000, novaContaPoupanca);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Exceção: "+ ex.getMessage());
		}
		System.out.println("O saldo da conta poupança é agora "+ novaContaPoupanca.getSaldo());
		System.out.println("O saldo da conta poupança é agora "+ novaContaCorrente.getSaldo());
		

	}

}
