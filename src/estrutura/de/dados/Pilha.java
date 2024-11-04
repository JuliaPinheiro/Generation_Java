package estrutura.de.dados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao;
		String nome = null;

		do {
			System.out.println("***********************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("***********************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Informe o livro que deseja adicionar: ");
				nome = scanner.nextLine();
				pilha.push(nome);
				System.out.println("Livro adicionado com sucesso!");
				break;

			case 2:
				if (!pilha.isEmpty()) {
					System.out.println("Lista dos livros: ");
					System.out.println(pilha);
				} else {
					System.out.println("Não há livros para listar!");
				}
				break;

			case 3:
				if (!pilha.isEmpty()) {
					System.out.println("Um Livro foi retirado da pilha! ");
					pilha.pop();
				} else {
					System.out.println("A pilha está vazia!");
				}
				break;
			}

		} while (opcao != 0);

	}

}
