package atividadetrês;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		/*
		5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
		A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
		
		
        // Solicitar temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Converter a temperatura para Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;

       //  temperatura convertida em Fahrenheit
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " °F");

        scanner.close();

	}

}
