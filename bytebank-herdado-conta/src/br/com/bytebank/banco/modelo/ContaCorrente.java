package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int agencia,int numero) {
		super(agencia, numero);
	}
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorSacar = valor +10;
		super.saca(valorSacar);
	}
}
