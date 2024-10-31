package vetores;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numeros[] = new int[10];
		int indiceImpar[] = new int[10];
		int numerosPares[] = new int[10];
		int countImpar = 0, countPares = 0;
		float soma = 0, media;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número: ");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];

			if (numeros[i] % 2 == 0) {
				numerosPares[countPares++] = numeros[i];
			}

			if (i % 2 != 0) {
				indiceImpar[countImpar++] = numeros[i];
			}
		}

		media = soma / numeros.length;

		System.out.print("Todos os elementos dos índices ímpares do vetor : ");
		for (int i = 0; i < countImpar; i++) {
			System.out.print(indiceImpar[i] + " ");
		}
		System.out.println();

		System.out.print("Todos os elementos do vetor que são números pares: ");
		for (int i = 0; i < countPares; i++) {
			System.out.print(numerosPares[i] + " ");
		}
		System.out.println();

		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f%n", media);

		scanner.close();

	}

}
