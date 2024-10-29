package aula07;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float saldo = 1000;
		int operacao;

		while (true) {
			System.out.println("Digite o código da operação:");
			System.out.println("1 - Saldo");
			System.out.println("2 - Saque");
			System.out.println("3 - Depósito");
			operacao = scan.nextInt();

			if (operacao < 1 || operacao > 3) {
				System.out.println("Operação Inválida!");
				break;
			}

			switch (operacao) {
			case 1:
				System.out.println("Operação - Saldo");
				System.out.println("Saldo: R$ " + saldo);
				break;

			case 2:
				System.out.print("Valor: R$ ");
				float valorSaque = scan.nextFloat();
				if (valorSaque > saldo) {
					System.out.println("Operação - Saque");
					System.out.println("Saldo Insuficiente!");
				} else {
					saldo -= valorSaque;
					System.out.println("Operação - Saque");
					System.out.println("Novo Saldo: R$ " + saldo);
				}
				break;

			case 3:
				System.out.print("Valor: R$ ");
				float valorDeposito = scan.nextFloat();
				saldo += valorDeposito;
				System.out.println("Operação - Depósito");
				System.out.println("Novo Saldo: R$ " + saldo);
				break;
			}
		}

		scan.close();
	}
}
