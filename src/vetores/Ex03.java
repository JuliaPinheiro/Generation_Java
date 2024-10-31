package vetores;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		float somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Informe o elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Elementos da Diagonal Principal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i]);
			somaDiagonalPrincipal += matriz[i][i];
		}
		System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);

		System.out.println("Elementos da Diagonal Secundária:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][2 - i]);
			somaDiagonalSecundaria += matriz[i][2 - i];
		}
		System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);

		scanner.close();
	}
}
