package laco.repeticao;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int age = 0, countUnder21 = 0, countOver50 = 0;

		while (age >= 0) {
			System.out.print("Informe a sua idade: ");
			age = scanner.nextInt();

			if (age > 0) {
				if (age < 21) {
					countUnder21++;
				} else if (age > 51) {
					countOver50++;
				}
			}
			System.out.println("total de pessoas cuja idade seja menor que 21 anos: " + countUnder21);
			System.out.println("total de pessoas cuja idade seja maior que 50 anos: " + countOver50);
		}
		scanner.close();
	}
}
