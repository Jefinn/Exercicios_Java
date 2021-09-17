package atividade;
import java.util.Scanner;
public class Ex02 {
	
/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a 
área do retângulo.*/
			
	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe a medida base de seu retângulo: ");
		int base = scn.nextInt();
		System.out.print("Informe a altura de seu retângulo: ");
		int altura = scn.nextInt();
		
		//Calculo
		int cont = base * altura;
		
		System.out.println("A área de seu retângulo é " + cont + "cm²");
		scn.close();
		

	}

}
