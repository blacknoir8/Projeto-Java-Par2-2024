package atividadetrês;

import java.util.Scanner;

public class Ex03 {

	/*
	 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 Calcular e escrever o valor do novo salário.
	 
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		
		String nome = sc.next();
		
		System.out.println("Digite seu salário atual: ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste salarial (em numeros decimais)");
		float reajuste = sc.nextFloat();
		
		// calcular o reajuste
		float salarioComReajuste = salario *  (reajuste/100);
		float novoSalario = salario + salarioComReajuste;
		
		// vai exibir novo salario
		
		System.out.println("O valor aumentado é de:  R$: " + salarioComReajuste);
		
		System.out.println("o Valor final é : R$ " + novoSalario);
		
		
		sc.close();
	}

}
