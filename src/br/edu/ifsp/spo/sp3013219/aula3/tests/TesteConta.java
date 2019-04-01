package br.edu.ifsp.spo.sp3013219.aula3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.edu.ifsp.spo.sp3013219.aula3.*;

public class TesteConta {
	
	@Test
	void instanciar_conta() {
		//1. Configuração
		String titular = "José";
		String num = "404-404";
		//2. Execução
		Conta conta = new Conta(num, titular);
		//3. Validação / Asserção
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(num, conta.getNumConta());	
	}
	
	@Test
	void tem_que_transferir() {
		//1. Configuração
		String titular = "José";
		String num = "404-404";
		String titular2 = "Maria";
		String num2 = "402-402";
		double transferir = 300.00;
		//2. Execução
		Conta conta = new Conta(num, titular);
		Conta conta2 = new Conta(num2, titular2);
		conta.setSaldo(600.00);
		conta2.setSaldo(600.00);
		conta.transferirPara(conta2, transferir);
		//3. Validação / Asserção
		assertEquals(600.00 - 300.00, conta.getSaldo());
		assertEquals(600.00 + 300.00, conta2.getSaldo());
	}
	
	@Test
	void exception_titular_nulo() {
		//1. Configuração
		String titular = null;
		String num = "303-303";
		//2. Execução
		try {
		Conta conta = new Conta(num, titular);
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}		
	}
	
	@Test
	void exception_numero_nulo() {
		//1. Configuração
		String titular = "José";
		String num = null;
		//2. Execução
		try {
		Conta conta = new Conta(num, titular);
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}		
	}
	
	@Test
	void exception_saldo_insuficiente_saque() {
		//1. Configuração
		String titular = "José";
		String num = "404-404";
		Conta conta = new Conta(num, titular);
		//2. Execução
		try {
			conta.setSaldo(40.00);
			conta.sacar(50.00);
		} catch(Exception exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	@Test
	void exception_limite_menor_ou_igual_zero() {
		//1. Configuração
		String titular = "José";
		String num = "404-404";
		double limite = 0;
		
		try {
			Conta conta = new ContaCorrente(num, titular, limite);
		}	catch(Exception exc) {
				System.out.println(exc.getMessage());
		}
	}
}
