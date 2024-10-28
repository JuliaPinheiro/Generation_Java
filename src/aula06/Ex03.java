/*
 *Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, 
 *em variáveis do tipo float e exiba na tela o Salário Líquido. Veja o exemplo abaixo:
 * */

package aula06;

import java.util.Scanner;

public class Ex03 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Informe seu salário bruto: ");
		salarioBruto = scan.nextFloat();
		
		System.out.println("Informe o adicional noturno: ");
		adicionalNoturno = scan.nextFloat();
		
		System.out.println("Informe as horas extras: ");
		horasExtras = scan.nextFloat();
		
		System.out.println("Informe os descontos: ");
		descontos = scan.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5)-descontos;
		
		System.out.println("O salário líquido é de: "+ salarioLiquido);
	}

}
