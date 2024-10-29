package aula06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor de n1: ");
		float n1 = scan.nextFloat();

		System.out.print("Digite o valor de n2: ");
		float n2 = scan.nextFloat();

		System.out.print("Digite o valor de n3: ");
		float n3 = scan.nextFloat();

		System.out.print("Digite o valor de n4: ");
		float n4 = scan.nextFloat();

		float produto1 = n1 * n2;
		float produto2 = n3 * n4;
		float diferenca = produto1 - produto2;

		System.out.printf("Diferença: %.1f%n", diferenca);

		scan.close();
	}

}
