package vetores;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float[][] notas = new float[10][4];
		float[] medias = new float[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe as 4 notas notas do participante " + (i + 1) + ":");
			for (int j = 0; j < 4; j++) {
				notas[i][j] = scanner.nextFloat();
			}
		}

		for (int i = 0; i < 10; i++) {
			float soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4;
		}

		System.out.println("\nMédias dos Participantes:");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Participante %d: %.1f%n", (i + 1), medias[i]);
		}

		scanner.close();
	}
}
