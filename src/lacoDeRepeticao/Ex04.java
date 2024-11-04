package lacoDeRepeticao;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean keep = true;
		int countBackend = 0, countWomenFrontend = 0, countManMobile40Plus = 0, countNonBinaryFullStackUnder30 = 0;
		int countTotalRespondents = 0;
		int totalAge = 0;

		while (keep) {
			System.out.print("Idade: ");
			int age = scanner.nextInt();

			if (age < 0) {
				break;
			}

			System.out.println("---------------------");
			System.out.println("Identidade de Gênero:");
			System.out.println("1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");
			int gender = scanner.nextInt();

			System.out.println("---------------------");
			System.out.println("Pessoa Desenvolvedora:");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			int stack = scanner.nextInt();

			totalAge += age;
			countTotalRespondents++;

			if (stack == 1) {
				countBackend++;
			}

			if (stack == 2) {
				if (gender == 1 || gender == 4) {
					countWomenFrontend++;
				}
			}

			if (stack == 3) {
				if (gender == 2 || gender == 5) {
					if (age > 40) {
						countManMobile40Plus++;
					}
				}
			}

			if (stack == 4) {
				if (gender == 3) {
					if (age < 30) {
						countNonBinaryFullStackUnder30++;
					}
				}
			}

			System.out.print("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
			keep = scanner.next().equalsIgnoreCase("S");
		}

		float averageAge = (countTotalRespondents > 0) ? (float) totalAge / countTotalRespondents : 0;

		System.out.println("O número de pessoas desenvolvedoras Backend: " + countBackend);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + countWomenFrontend);
		System.out.println(
				"O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + countManMobile40Plus);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: "
				+ countNonBinaryFullStackUnder30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + countTotalRespondents);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n", averageAge);

		scanner.close();
	}
}
