package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {

		Set<Integer> valores = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 valores inteiros:");

		for (int i = 0; i < 10; i++) {
			int valor = scanner.nextInt();
			valores.add(valor);
		}

		System.out.println("Listar dados do Set:");
		Iterator<Integer> iterator = valores.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		scanner.close();

	}

}
