package aula07;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		String escolha = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println(" Infome uma opção ");
		System.out.println("1- Vertebrado");
		System.out.println("2- Invertebrado");
		System.out.println("------------------");
		int opcao = scan.nextInt();
		scan.nextLine();
		if(opcao != 1 && opcao != 2) {
			System.out.println("Opção inválida");
		}
		if(opcao == 1) {
			System.out.println("Ave ou Mamifero?");
			escolha = scan.nextLine();
			if(escolha.equalsIgnoreCase("ave")) {
				System.out.println("Carnívoro ou Onívoro");
				escolha = scan.nextLine();
				if(escolha.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				} else if(escolha.equalsIgnoreCase("Onívoro")) {
					System.out.println("Pomba");
				}
			} else if(escolha.equalsIgnoreCase("Mamifero")) {
				System.out.println("Onívoro ou Herbívoro?");
				escolha = scan.nextLine();
				if(escolha.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				} else if(escolha.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				}
			}
		} else if(opcao == 2) {
			System.out.println("Inseto ou Anelídeo");
			escolha = scan.nextLine();
			if(escolha.equalsIgnoreCase("Inseto")) {
				System.out.println("Hematófago ou Herbívoro?");
				escolha = scan.nextLine();
				if(escolha.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
				} else if(escolha.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Lagarta");
				}
			} else if(escolha.equalsIgnoreCase("Anelídeo")) {
				System.out.println("Hematófago ou Onívoro");
				escolha = scan.nextLine();
				if(escolha.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				} else if(escolha.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				}
			}
		}
		scan.close();
	}
}