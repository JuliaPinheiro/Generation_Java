package lacoDeRepeticao;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOne, numberTwo;

		System.out.print("Informe o primeiro número ");
		numberOne = scanner.nextInt();

		System.out.print("Informe o segundo número ");
		numberTwo = scanner.nextInt();

		if (numberOne >= numberTwo) {
			System.out.println("intervalo inválido!!");
		} else {
			System.out.println("No intervalo entre " + numberOne + " e " + numberTwo + ":");
			for (int i = numberOne; i <= numberTwo; i++) {
				if (i % 3 == 0 && i % 5 == 0) {

					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		}

		scanner.close();
	}
}
