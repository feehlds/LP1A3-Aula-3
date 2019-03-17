package br.edu.ifsp.spo.sp3013219.aula3;

public class ContaPoupanca extends Conta{

	//V�RIAVEIS
	static double taxaRendimento = 1.005;
	
	
	//CONSTRUTOR
		public ContaPoupanca(int num, String titular, double saldo) {
			setNumConta(num);
			setTitular(titular);
			depositar(saldo);
		}
	
	
	//M�TODOS
	public void aplicarRendimento() {
		this.saldo = this.saldo * taxaRendimento;
	}
	
}
