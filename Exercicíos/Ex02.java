package atividade;
import java.util.Scanner;
public class Ex02 {
	
/*Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a 
�rea do ret�ngulo.*/
			
	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a medida base de seu ret�ngulo: ");
		int base = scn.nextInt();
		System.out.print("Informe a altura de seu ret�ngulo: ");
		int altura = scn.nextInt();
		
		//Calculo
		int cont = base * altura;
		
		System.out.println("A �rea de seu ret�ngulo � " + cont + "cm�");
		scn.close();
		

	}

}
