package atividade;
import java.util.Scanner;
public class Ex05 {

/*Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste.
Calcular e escrever o valor do novo sal�rio.*/
	
	public static void main (String[]args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe seu sal�rio mensal: R$ ");
		int salario = scn.nextInt();
		System.out.print("Informe o reajuste em seu sal�rio: ");
		int reajuste = scn.nextInt();
		
		//Calculo
		double cal = salario/100*reajuste;
		
		System.out.print("Seu novo sal�rio �: " + "R$" + cal);
		
		scn.close();
	}
}
