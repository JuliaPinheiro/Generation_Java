package lacoDeRepeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		float sum = 0;

		do {
			System.out.println("Digite um número: ");
			number = scanner.nextInt();

			if (number > 0) {
				sum += number;
			}
		} while (number != 0);

		System.out.println("A soma dos números positivos é: " + sum);
		scanner.close();
		

	}

}
