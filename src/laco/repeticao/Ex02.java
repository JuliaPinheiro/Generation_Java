package laco.repeticao;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int counterPair = 0, counterOdd = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o " + i + " º número inteiros: ");
			int number = scanner.nextInt();

			if (number % 2 == 0) {
				counterPair += 1;
			} else {
				counterOdd += 1;
			}

			System.out.println("Total de números pares: " + counterPair + " Total de números ímpares: " + counterOdd);
		}

		scanner.close();
	}

}
