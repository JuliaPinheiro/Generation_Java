package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.println("informe a " + i + " ª cor:");
			cores.add(scanner.nextLine());
		}

		System.out.println("Listar todas as cores:" + cores);

		Collections.sort(cores);
		for (String cor : cores) {
			System.out.println("Ordenar as cores:" + cor);
		}
	}
}
