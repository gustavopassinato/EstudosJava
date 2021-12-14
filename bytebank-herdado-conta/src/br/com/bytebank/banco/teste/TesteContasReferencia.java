package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Debugger;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContasReferencia {

	public static void main(String[] args) throws SaldoInsuficienteException{
//		String[] nome = new String[] {"gustavo"};
//		System.out.println(nome[0] == "gustavo");
//		
//		if (args.length>0) {
//			System.out.println(args[0]);
//			if (args[0] == nome[0]) {
//				System.out.println("funcionou");
//				Debugger debugger = new Debugger();
//				debugger.debuggerIni();
//			}
//		}
		
		Conta[] arrayContas = new Conta[5];
		
		ContaCorrente conta1 = new ContaCorrente(11,12);
		
		arrayContas[0] = conta1;
		arrayContas[0].deposita(1000);
		
		System.out.println(arrayContas[0].getSaldo());
		
		ContaPoupanca conta2 = new ContaPoupanca(12,13);
		
		arrayContas[1] = conta2;
		
		arrayContas[1].deposita(1000);
		try {
			arrayContas[0].transfere(995, arrayContas[1]);
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Saldo conta 1 (corrente) "+ arrayContas[0].getSaldo());
		System.out.println("Saldo conta 2 (poupança) "+ arrayContas[1].getSaldo());
		

	}

}
