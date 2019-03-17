package br.edu.ifsp.spo.sp3013219.aula3;

public class ContaPoupanca extends Conta{

	//VÁRIAVEIS
	static double taxaRendimento = 1.005;
	
	
	//CONSTRUTOR
		public ContaPoupanca(String num, String titular, double saldo) {
			super(num, titular);
		}
	
	
	//MÉTODOS
	public void aplicarRendimento() {
		this.saldo = this.saldo * taxaRendimento;
	}
	
}
