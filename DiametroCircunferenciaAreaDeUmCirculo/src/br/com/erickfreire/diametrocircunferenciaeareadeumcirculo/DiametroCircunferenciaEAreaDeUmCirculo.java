package br.com.erickfreire.diametrocircunferenciaeareadeumcirculo;

import java.util.Scanner;

public class DiametroCircunferenciaEAreaDeUmCirculo {

	public static void main(String[] args) {
		
		double raio = 0.0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula o Di�metro, Circunfer�ncia E �rea de Um C�rculo: ");
		System.out.print("Digite o Raio de um c�rculo: ");
		raio = entrada.nextDouble();
		
		System.out.printf("\nDi�metro: %.2f\n", (2 * raio));
		System.out.printf("Circunfer�ncia: %.2f\n", (2 * Math.PI * raio));
		System.out.printf("�rea do C�rculo: %.2f", (Math.PI * (raio * raio)));
		

	}

}
