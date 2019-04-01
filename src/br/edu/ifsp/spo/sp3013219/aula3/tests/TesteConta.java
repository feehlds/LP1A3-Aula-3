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
	
}
