package br.edu.ifsp.spo.sp3013219.aula3;

public class Conta {
	
	//VARIÁVEIS
	private int numConta;
	private String titular;
	protected double saldo;
	
	
	//MÉTODOS
	public void transferirPara(Conta outraConta, double valor) {
		this.sacar(valor);
		outraConta.depositar(valor);
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if(valor <= getSaldo()) {	
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Sem Saldo!");
		}
	}
	
	
	//GETTERS E SETTERS
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
