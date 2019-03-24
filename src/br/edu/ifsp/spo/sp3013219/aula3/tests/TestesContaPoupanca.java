package br.edu.ifsp.spo.sp3013219.aula3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.edu.ifsp.spo.sp3013219.aula3.*;


public class TestesContaPoupanca {
	
	@Test
	void criar_conta_poupanca() {
		//1. Configuração
		String titular = "Clark Quente";
		String num = "101-101";
		
		//2. Execução
		Conta cp = new ContaPoupanca(num, titular);
		
		//3. Validação / Asserção
		assertNotNull(cp);
		assertEquals(num, cp.getNumConta());
		assertEquals(titular, cp.getTitular());		
	}
	
	@Test
	void aplicar_rendimento() {
		//1. Configuração
		String titular = "Barril Allen";
		String num = "101-102";
		
		//2. Execução
		Conta cp = new ContaPoupanca(num, titular);
		cp.setSaldo(100.00);
		double saldoInicial = cp.getSaldo();
		((ContaPoupanca) cp).aplicarRendimento();
		
		//3. Validação / Asserção
		assertEquals(saldoInicial * ContaPoupanca.taxaRendimento, cp.getSaldo());
	}
}
