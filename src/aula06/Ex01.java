// Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java: 

package aula06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe seu salário: ");
		float salarioAnterior = scan.nextFloat();
		
		System.out.println("Informe o abono: ");
		float abono = scan.nextFloat();
		
		float novoSalario = salarioAnterior + abono;
		
		System.out.println("Seu novo salário é de: "+ novoSalario);
		
	}

}
