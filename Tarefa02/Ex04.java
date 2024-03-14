package atividadetrês;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
	/*	4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
(aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/
		
		Scanner sc = new Scanner (System.in);
		
		// CUSTO FABRICA CARRO
		
		System.out.println("Digite custo de fabrica do carro");
		double custoCarro = sc.nextDouble();
		
		// IMPOSTOS E TRIBUTOS
		
		double percentualDistribuidora = 0.28; // 28%
		double percentualImpostos = 0.45; // 45%
		
		// CALCULO CUSTO DISTRIBUIDOR E CUSTO DOS IMPOSTOS
		
		double custoDistri = custoCarro*percentualDistribuidora; // 5600
		double custoImposto = custoCarro*percentualImpostos;
		
		// CALCULO FINAL
		
		double custoFinal = custoCarro + custoDistri + custoImposto;
		
		System.out.println("O custo final ao consumidor é: R$ " + custoFinal );
		
		sc.close();
		
		

	}

}
