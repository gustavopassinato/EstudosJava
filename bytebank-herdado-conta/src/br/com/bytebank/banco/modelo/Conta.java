package br.com.bytebank.banco.modelo;

public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int contadorContas;
	
	public Conta(int agencia, int numero){
		contadorContas++;
		// Construtur da classe conta
		this.agencia = agencia;
		this.numero = numero;	
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo - valor < 0) {
			throw new SaldoInsuficienteException("Saldo: "+ this.saldo + " Saque: "+ valor);
		}
		this.saldo -= valor;
	}
	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	public double getSaldo(){
		return this.saldo;
	}
	public int getAgencia(){
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public static int getContadorContas() {
		return contadorContas;
	}
	@Override
	public String toString() {
		return "Agencia: "+ getAgencia()+ " Número: "+getNumero();
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		if (conta.numero != this.numero) {
			return false;
		}
		if (conta.agencia != this.agencia) {
			return false;
		}
		return true;
	}
}