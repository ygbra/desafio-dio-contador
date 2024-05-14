package edu.dio.controle.main;

import java.util.Scanner;

/**
 * Classe para fazer uma contagem a partir da diferença entre dois números digitados pelo usuário
 * @author Luiz Rodrigo
 */

public class Contador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		int segundoNumero = entrada.nextInt();
		
		try {
			contador(primeiroNumero, segundoNumero);
		}
		catch(ParametrosInvalidosException e) {
			System.out.println("O segundo número deve ser maior que o primeiro");
		}
	}
	
	static void contador(int parametro, int parametro2) throws ParametrosInvalidosException{
		if(parametro > parametro2) {
			throw new ParametrosInvalidosException();
		}
		
		int limite = parametro2 - parametro;
		for(int i = 1; i <= limite; i++) {
			System.out.println("Número: "+i);
		}
	}
}
