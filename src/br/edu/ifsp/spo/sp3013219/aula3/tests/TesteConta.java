package br.edu.ifsp.spo.sp3013219.aula3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.edu.ifsp.spo.sp3013219.aula3.*;

public class TesteConta {
	
	@Test
	void exception_titular_nulo() {
		//1. Configura��o
		String titular = null;
		String num = "303-303";
		//2. Execu��o
		try {
		Conta conta = new Conta(num, titular);
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}		
	}
	
	@Test
	void exception_numero_nulo() {
		//1. Configura��o
		String titular = "Jos�";
		String num = null;
		//2. Execu��o
		try {
		Conta conta = new Conta(num, titular);
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}		
	}
	
}
