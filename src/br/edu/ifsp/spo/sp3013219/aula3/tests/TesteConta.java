package br.edu.ifsp.spo.sp3013219.aula3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.edu.ifsp.spo.sp3013219.aula3.*;

public class TesteConta {
	
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
