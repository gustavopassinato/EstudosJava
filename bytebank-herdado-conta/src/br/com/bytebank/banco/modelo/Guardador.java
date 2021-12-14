package br.com.bytebank.banco.modelo;

public class Guardador {
	
	private Conta[] contas;
	private int posicaoLivre;
	
	
	public Guardador() {
		this.contas = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void guardaContas(Conta conta) {
		this.contas[posicaoLivre] = conta;
		posicaoLivre ++;
	}
	
	public int getPosicaoLivre() {
		return this.posicaoLivre;
	}
	
	public Conta getReferencia(int posicao) {
		return this.contas[posicao];
	}

}
