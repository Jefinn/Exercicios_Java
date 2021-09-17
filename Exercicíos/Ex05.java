package atividade;
import java.util.Scanner;
public class Ex05 {

/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.*/
	
	public static void main (String[]args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe seu salário mensal: R$ ");
		int salario = scn.nextInt();
		System.out.print("Informe o reajuste em seu salário: ");
		int reajuste = scn.nextInt();
		
		//Calculo
		double cal = salario/100*reajuste;
		
		System.out.print("Seu novo salário é: " + "R$" + cal);
		
		scn.close();
	}
}
