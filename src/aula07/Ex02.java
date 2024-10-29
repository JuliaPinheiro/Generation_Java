package aula07;

import java.util.Scanner;

public class Ex02 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = scan.nextInt();
		
		String parOuImpar = (numero % 2 == 0 ) ? "par" : "impar"; 
		
		if (numero > 0) {
			System.out.println("o número "+numero +" é "+parOuImpar+ " e positivo" );
		} else if (numero < 0) {
			System.out.println("o número "+numero +" é "+parOuImpar+ " e negativo");
		}
	
	}
	 
}
