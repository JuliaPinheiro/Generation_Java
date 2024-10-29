package aula07;

import java.util.Scanner;

public class Ex03 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Informe o nome do doador: ");
		String nome = scan.nextLine();
		
		System.out.println("Informe a idade do doador:");
		int idade = scan.nextInt();
		
		System.out.println("É a primeira doação?");
		boolean primeira = scan.nextBoolean();
		
		String apto;
		
		if( idade >= 18 && idade<= 69) {
			if(idade >= 60 && idade <=69 && primeira) {
				apto = " não está apto";
			} else {
				apto = " está apto";
				}
			
		} else apto = " não está apto";
		
			
		System.out.println("O(a) doador(a): "+ nome + apto);
			
		scan.close();
	
	}

}
