package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String nome = null;

		do {
			System.out.println("***********************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("***********************************");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Informe o nome do novo cliente: ");
				nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Nome adicionado com sucesso!");
				break;

			case 2:
				if (!fila.isEmpty()) {
					System.out.println("Lista dos clientes: ");
					System.out.println(fila);
				} else {
					System.out.println("Não há clientes para listar!");
				}
				break;

			case 3:
				if (!fila.isEmpty()) {
					System.out.println("Cliente chamado com sucesso! ");
					fila.remove();
				} else {
					System.out.println("A fila está vazia!");
				}
				break;
			}

		} while (opcao != 0);

		scanner.close();
	}

}
