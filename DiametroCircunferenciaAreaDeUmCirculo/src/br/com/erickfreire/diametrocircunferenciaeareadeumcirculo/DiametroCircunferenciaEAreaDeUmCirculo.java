package br.com.erickfreire.diametrocircunferenciaeareadeumcirculo;

import java.util.Scanner;

public class DiametroCircunferenciaEAreaDeUmCirculo {

	public static void main(String[] args) {
		
		double raio = 0.0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula o Diâmetro, Circunferência E Área de Um Círculo: ");
		System.out.print("Digite o Raio de um círculo: ");
		raio = entrada.nextDouble();
		
		System.out.printf("\nDiâmetro: %.2f\n", (2 * raio));
		System.out.printf("Circunferência: %.2f\n", (2 * Math.PI * raio));
		System.out.printf("Área do Círculo: %.2f", (Math.PI * (raio * raio)));
		

	}

}
