package lacoDeRepeticao;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int count = 0;
		float sum = 0;

		do {
			System.out.print("Digite um número: ");
			number = scanner.nextInt();

			if (number % 3 == 0 && number != 0) {
				sum += number;
				count++;
			}

		} while (number != 0);

		float average = (count > 0) ? sum / count : 0;

		System.out.println("A média de todos os números múltiplos de 3 é: " + average);

		scanner.close();
	}
}
