package aula07;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float result, num1, num2;

		System.out.println("Código Operação");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("-----------------");
		int cod = scan.nextInt();

		if (cod < 1 || cod > 4) {
			System.out.println("Operação Inválida!");
		} else {
			System.out.println("Informe o primeiro número: ");
			num1 = scan.nextFloat();

			System.out.println("Informe o segundo número: ");
			num2 = scan.nextFloat();

			switch (cod) {
			case 1:
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case 3:
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case 4:
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + result);
				} else {
					System.out.println("Erro: Divisão por zero!");
				}
				break;
			}
		}

		scan.close();
	}
}
