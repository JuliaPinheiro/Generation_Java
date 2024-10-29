package aula07;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
	
	int a, b , c, soma;
	
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Informe o valor de A ");
	a = scan.nextInt();
	
	System.out.println("Informe o valor de B ");
	b = scan.nextInt();
	
	System.out.println("Informe o valor de C ");
	c = scan.nextInt();
	
	soma = a+b;
	
    if (soma > c) {
        System.out.println(String.format("A soma de %d + %d é maior que %d.", a, b, c));
    } else if (soma < c) {
        System.out.println(String.format("A soma de %d + %d é menor que %d.", a, b, c));
    } else {
        System.out.println(String.format("A soma de %d + %d é igual a %d.", a, b, c));
    }
		scan.close();
	}
	
}
