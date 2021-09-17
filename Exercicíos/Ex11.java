package atividade;
import java.util.Scanner;
public class Ex11 {
	
/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int numero = scn.nextInt();
		
		if(numero>0) {
			System.out.println("Postivo");
		}else
			System.out.println("Negativo");
		
		
		scn.close();
 
	}

}
