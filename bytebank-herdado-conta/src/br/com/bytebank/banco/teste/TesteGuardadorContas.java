package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Guardador;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		Conta conta1 = new ContaCorrente(123, 231);
		
		Guardador guardador = new Guardador();
		
		guardador.guardaContas(conta1);
		
		Conta conta2 = new ContaPoupanca(12,22);
		
		guardador.guardaContas(conta2);
		
		System.out.println("Proxima possição livre no guardador "+ guardador.getPosicaoLivre());
		
		Conta referenciaConta1 = guardador.getReferencia(1);
		
		referenciaConta1.deposita(1000);
		System.out.println(referenciaConta1.getSaldo());

	}

}
