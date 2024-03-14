package segundaAtividade;

import java.util.Scanner;

public class Ex01 {
	/*
	  1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
	   e escreva a idade dessa pessoa expressa apenas em dias. 
	   Considerar ano com 365 dias e mês com 30 dias.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Queremos saber sua idade em dias");
		
		System.out.println("Digite a idade da pessoas em anos completos");
		int anos = sc.nextInt();
		
		System.out.println("Digite a idade da pessoas em meses");
		
		int meses = sc.nextInt();
		
		System.out.println("Digite a idade da pessoas em dias");
		int dias = sc.nextInt();
		
		
		int idadeEmDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("A quantidade de dias vividos é : " + idadeEmDias);
		
		
		sc.close();
				
	}

}
