package br.edu.ifsp.spo.sp3013219.aula3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.edu.ifsp.spo.sp3013219.aula3.*;


public class TestesContaPoupanca {
	
	@Test
	void criar_conta_poupanca() {
		//1. Configura��o
		String titular = "Clark Quente";
		String num = "101-101";
		
		//2. Execu��o
		Conta cp = new ContaPoupanca(num, titular);
		
		//3. Valida��o / Asser��o
		assertNotNull(cp);
		assertEquals(num, cp.getNumConta());
		assertEquals(titular, cp.getTitular());		
	}
	
	@Test
	void aplicar_rendimento() {
		//1. Configura��o
		String titular = "Barril Allen";
		String num = "101-102";
		
		//2. Execu��o
		Conta cp = new ContaPoupanca(num, titular);
		cp.setSaldo(100.00);
		double saldoInicial = cp.getSaldo();
		((ContaPoupanca) cp).aplicarRendimento();
		
		//3. Valida��o / Asser��o
		assertEquals(saldoInicial * ContaPoupanca.taxaRendimento, cp.getSaldo());
	}
}
