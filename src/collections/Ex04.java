package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		HashSet<Integer> valor = new HashSet<>();

		Scanner scanner = new Scanner(System.in);

		Collections.addAll(valor, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		System.out.println("Informe um número que queira encontrar: ");
		int numero = scanner.nextInt();

		if (valor.contains(numero)) {
			System.out.println("O numero " + numero + " foi encontrado!");
		} else {
			System.out.println("O numero " + numero + " não foi encontrado! ");
		}
		scanner.close();
	}
}
