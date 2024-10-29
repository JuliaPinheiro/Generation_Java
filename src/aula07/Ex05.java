package aula07;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int quantidade = 0;
		float preco = 0;
		String produto = "";

		System.out.printf("%-20s %-20s %-15s%n", "Código do Produto", "Produto", "Preço Unitário");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%-20d %-20s %-15s%n", 1, "Cachorro Quente", "R$ 10.00");
		System.out.printf("%-20d %-20s %-15s%n", 2, "X-Salada", "R$ 15.00");
		System.out.printf("%-20d %-20s %-15s%n", 3, "X-Bacon", "R$ 18.00");
		System.out.printf("%-20d %-20s %-15s%n", 4, "Bauru", "R$ 12.00");
		System.out.printf("%-20d %-20s %-15s%n", 5, "Refrigerante", "R$ 8.00");
		System.out.printf("%-20d %-20s %-15s%n", 6, "Suco de Laranja", "R$ 13.00");
		System.out.println("---------------------------------------------------------------");
		int codigoDoProduto = scan.nextInt();

		switch (codigoDoProduto) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10;
			break;
		case 2:
			produto = "X-Salada";
			preco = 15;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18;
			break;
		case 4:
			produto = "Bauru";
			preco = 12;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13;
			break;

		}

		System.out.println("Quantos você deseja?");
		quantidade = scan.nextInt();

		float valorTotal = (quantidade * preco);

		System.out.println("Produto: " + produto);
		System.out.println("Valor total: " + valorTotal);

		scan.close();
	}
}
