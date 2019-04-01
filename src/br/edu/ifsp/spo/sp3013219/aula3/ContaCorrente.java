package br.edu.ifsp.spo.sp3013219.aula3;

public class ContaCorrente extends Conta{
	
	//VARIÁVEIS
	private double limiteChequeEspecial;
	private double chequeEspecial = 0;
	public static double taxaJurosChequeEspecial = 0.13;
	static double imposto = 1.01;
	
	
	//CONSTRUTOR
	public ContaCorrente(String num, String titular, double limite) {
		super(num, titular);
		
		if(limite <= 0) {
			throw new AccLimiteException("O limite deve ser maior que zero!");
		}	else {
			setLimiteChequeEspecial(limite);
		}
	}
	
	
	//MÉTODOS
	public void debitarJuros() {
		depositar(- chequeEspecial * taxaJurosChequeEspecial);
	}
	@Override
	public void sacar(double valor){
		if(valor <= getSaldo()) {	
			this.saldo = this.saldo - valor * imposto;
		} else {
			if(getChequeEspecial() + valor*imposto < limiteChequeEspecial) {
				setChequeEspecial(getChequeEspecial() + (valor * imposto));
				debitarJuros();
			} else {
				System.out.println("Sem limite de cheque especial!");
			}
		}
	}	
	
	
	//GETTERS E SETTERS
	public double getLimiteChequeEspecial() {
		return this.limiteChequeEspecial;
	}
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}
