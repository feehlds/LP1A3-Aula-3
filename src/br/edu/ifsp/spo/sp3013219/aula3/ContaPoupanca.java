package br.edu.ifsp.spo.sp3013219.aula3;

public class ContaPoupanca extends Conta{

	//V�RIAVEIS
	public static double taxaRendimento = 1.005;
	
	
	//CONSTRUTOR
		public ContaPoupanca(String num, String titular) {
			super(num, titular);
		}
	
	
	//M�TODOS
	public void aplicarRendimento() {
		this.saldo = this.saldo * taxaRendimento;
	}
	
}
