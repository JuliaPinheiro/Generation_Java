package aula07;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome do colaborador: ");
		String nome = scan.nextLine();

		System.out.println("Código do cargo de 1 a 6: ");
		int cod = scan.nextInt();

		System.out.println("informe seu salário ");
		float salario = scan.nextFloat();

		float reajuste = salario;
		String cargo = "";

		switch (cod) {
		case 1:
			reajuste += salario * 0.10;
			cargo = "Gerente";
			break;
		case 2:
			reajuste += salario * 0.07;
			cargo = "Vendedor";
			break;
		case 3:
			reajuste += salario * 0.09;
			cargo = "Supervisor";
			break;
		case 4:
			reajuste += salario * 0.06;
			cargo = "Motorista";
			break;
		case 5:
			reajuste += salario * 0.05;
			cargo = "Estoquista";
			break;
		case 6:
			reajuste += salario * 0.08;
			cargo = "Técnico de TI";
			break;
		}
		
		System.out.println("--------------------------------");
		System.out.println("Colaborador: "+ nome);
		System.out.println("Cargo: "+ cargo);
		System.out.println("Salário com reajuste: "+ reajuste);
		
	}

}
