/** 
 * Elabore um algoritmo em Java que leia 4 notas de um participante, 
 * em variáveis do tipo float e exiba na tela a média final do participante. Veja o exemplo abaixo:
 * **/


package aula06;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int contNotas = 4;
		float[] notas = new float [contNotas];
		float soma = 0;
			
        for (int i = 0; i < contNotas; i++) {
            System.out.printf("Digite a Nota : ", i + 1);   
            notas[i] = scan.nextFloat();
            soma += notas[i];   
        }
		
		float media = soma/contNotas;
		
		System.out.printf("Média das notas: "+ media);
		
	}
}
