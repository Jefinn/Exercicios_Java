package atividade;
import java.util.Scanner;
public class Ex03 {
	
/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("Informe sua idade: ");
		int idade = scn.nextInt();
		
		//Calculo
		int mes = idade * 12;
		int dias = idade * 365;
		
		System.out.println("Sua idade em meses é " + mes + " meses");
		System.out.println("Sua idade em dias é " + dias + " dias");
		scn.close();
	}

}
