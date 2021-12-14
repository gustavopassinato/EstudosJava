package br.com.bytebank.banco.modelo;

public abstract class CalculadorImpostos {
	
	private static double somaImpostos;

	public double getSomaImpostos() {
		return somaImpostos;
	}

	public static void setSomaImpostos(double impostosRecebidos) {
		somaImpostos += impostosRecebidos;
	}
	
	

}
