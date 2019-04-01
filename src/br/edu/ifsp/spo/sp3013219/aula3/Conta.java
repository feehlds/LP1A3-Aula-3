package br.edu.ifsp.spo.sp3013219.aula3;

public class Conta {
	
	//VARIÁVEIS
	private String numConta;
	private String titular;
	protected double saldo;
	
	
	//CONSTRUTOR
	public Conta(String num, String titular) {
		if(num == null || num.trim().isBlank()) {
			throw new AccNumException("Número da conta não deve ser null");
		
		} else if(titular == null || titular.trim().isBlank()) {
			throw new AccTitularException("O Campo titular deve ser preenchido");
			
			}	else {
					setNumConta(num);
					setTitular(titular);
					setSaldo(0);
				}
	}	
	
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
			throw new AccSaldoException("O valor é maior que o saldo em conta");
		}
	}
	
	
	//OVERRIDES TOSTRING E EQUALS
	@Override
	public String toString() {
		return this.getNumConta() + " , " + this.getTitular() + " , " + this.getSaldo();
	}
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		
		if(obj.getClass() == this.getClass()) {
			Conta other = (Conta)obj;
			resultado = this.getNumConta().equals(other.getNumConta());
		}
		
		return resultado;
	}
	
	
	//GETTERS E SETTERS
	public String getNumConta() {
		return this.numConta;
	}
	public void setNumConta(String numConta) {
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
