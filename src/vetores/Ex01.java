package vetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean encontrado = false;
		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.print("Informe um número entre 1 - 10: ");
		int opcao = scanner.nextInt();

		for (int i = 0; i < numeros.length; i++) {

			if (opcao == numeros[i]) {
				System.out.println("o número " + opcao + " esta na posição " + i);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Não foi encontrado!");
		}
		scanner.close();
	}

}
