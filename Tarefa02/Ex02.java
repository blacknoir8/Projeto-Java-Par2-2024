package segundaAtividade;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 	2) Escreva um algoritmo para ler o número total de eleitores de um município,
		 	 o número de votos brancos, nulos e válidos. 
		 	 Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
		 	 	 
	*/
	Scanner sc = new Scanner(System.in);
	
	int votosBranco, votosNulos, votosValidos, totalEleitores;
	float porcentBrancos, porcentNulos, porcentValidos;
	
	System.out.println("Digite numero total de votos brancos");
	votosBranco = sc.nextInt();
	
	System.out.println("Digite numero total de votos nulos");
	votosNulos = sc.nextInt();
	
	System.out.println("Digite numero total de votos validos");
	votosValidos = sc.nextInt();
	
	totalEleitores = votosBranco+votosNulos+votosValidos;
	
	porcentBrancos = ((float)votosBranco/totalEleitores)*100;
	porcentNulos = ((float)votosNulos/totalEleitores)*100;
	porcentValidos = ((float)votosValidos/totalEleitores)*100;
	
	System.out.println("Total de Eleitores que votaram: " + totalEleitores);
	System.out.println("O percentual de votos brancos foi: " + (int) porcentBrancos + "%");
	System.out.println("O percentual de votos nulos foi: " + (int) porcentNulos + "%");
	System.out.println("O percentual de votos validos foi:  " + (int) porcentValidos + "%");
	
	
sc.close();
	}

}
