package atividade;
import java.util.Scanner;
public class Ex23 {

/*Ler um valor e escrever se é positivo, negativo ou zero.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		int valor = scn.nextInt();
		
		if(valor>0) {
			System.out.println("Positivo");
		}
		else if(valor<0) {
			System.out.println("Negativo");
		}
		if(valor==0) {
			System.out.println("Zero");
		}

		scn.close();
	}

}
