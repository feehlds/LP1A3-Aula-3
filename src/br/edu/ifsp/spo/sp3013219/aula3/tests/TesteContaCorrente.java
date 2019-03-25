package br.edu.ifsp.spo.sp3013219.aula3.tests;
import static org.junit.jupiter.api.Assertions.*;
import br.edu.ifsp.spo.sp3013219.aula3.ContaCorrente;
import org.junit.jupiter.api.Test;
import br.edu.ifsp.spo.sp3013219.aula3.*;

public class TesteContaCorrente {
	
	@Test
	void criar_conta_conrrente() {
		//1. Configura��o
		String titular = "Jo�o da Silva";
		String num = "101-101";
		double limite = 200.00;
		Conta cc = null;
		
		//2. Execu��o
		cc = new ContaCorrente(num, titular, limite);
		
		//3. Valida��o / Asser��o
		assertNotNull(cc);
		assertEquals(cc.getNumConta(), num);
		assertEquals(cc.getTitular(), titular);
		assertEquals(((ContaCorrente) cc).getLimiteChequeEspecial(), limite);
	}
	
	@Test
	void debitar_juros() {
		//1. Configura��o
		String titular = "Jo�o da Silva";
		String num = "101-101";
		double limite = 200.00;
		double saldoInicial = 200.00;
		Conta cc = null;
		
		
		//2. Execu��o
		cc = new ContaCorrente(num, titular, limite);
		cc.setSaldo(saldoInicial);
		cc.setSaldo(200);
		((ContaCorrente) cc).setChequeEspecial(30);
		((ContaCorrente) cc).debitarJuros();
		
		//3. Valida��o / Asser��o
		assertEquals(saldoInicial + (- ((ContaCorrente) cc).getChequeEspecial() * ContaCorrente.taxaJurosChequeEspecial), cc.getSaldo());	
	}
	
	@Test
	void teste_sacar() {
		//1. Configura��o
		String titular = "Jo�o da Silva";
		String num = "101-101";
		double limite = 200.00;
		double saldoInicial = 200.00;
		Conta cc = null;
		
		//2. Execu��o
		cc = new ContaCorrente(num, titular, limite);
		cc.setSaldo(saldoInicial);
		cc.sacar(100);
		
		//3.
		assertEquals(saldoInicial - 100, cc.getSaldo());
	}
	
	
	
}
