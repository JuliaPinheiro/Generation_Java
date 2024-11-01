package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> valor = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		Collections.addAll(valor, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		System.out.println("Informe um número que queira encontrar: ");
		int numero = scanner.nextInt();

		if (valor.contains(numero)) {
			System.out.println("O numero " + numero + " está localizado na posição: " + valor.indexOf(numero));
		} else {
			System.out.println("O numero " + numero + " não foi encontrado! ");
		}
		scanner.close();
	}
}
