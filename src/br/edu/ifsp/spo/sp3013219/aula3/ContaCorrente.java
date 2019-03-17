package br.edu.ifsp.spo.sp3013219.aula3;

public class ContaCorrente extends Conta{
	
	//VARIÁVEIS
	private double limiteChequeEspecial;
	static double taxaJurosChequeEspecial = 0.13;
	static double imposto = 1.01;
	
	
	//CONSTRUTOR
	public ContaCorrente(int num, String titular, double saldo, double limite) {
		setNumConta(num);
		setTitular(titular);
		depositar(saldo);
		setLimiteChequeEspecial(limite);
	}
	
	
	//MÉTODOS
	public void debitarJuros() {
		depositar(- limiteChequeEspecial * taxaJurosChequeEspecial);
	}
	@Override
	public void sacar(double valor){
		if(valor <= getSaldo()) {	
			this.saldo = this.saldo - valor * imposto;
		} else {
			if((getSaldo() - valor*imposto) * -1 <= limiteChequeEspecial) {
				this.saldo = this.saldo - valor * imposto;
			} else {
				System.out.println("Sem limite de cheque especial!");
			}
		}
	}
	
	
	
	public double getLimiteChequeEspecial() {
		return this.limiteChequeEspecial;
	}
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
}
