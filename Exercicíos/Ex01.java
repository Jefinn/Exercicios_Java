package atividade;
import java.util.Scanner;

public class Ex01 {

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int num = scn.nextInt();
		
		int cont = num - 1;
		
		System.out.println("Seu antessesor é " + cont);
		
		scn.close();
		
	
		
	
	}

}
