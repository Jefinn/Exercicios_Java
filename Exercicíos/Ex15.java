package atividade;
import java.util.Scanner;
public class Ex15 {
	
/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.*/
	
	public static void main (String[]args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Informe um valor: ");
		int valor = scn.nextInt();
		System.out.println("Informe outro valor: ");
		int valor2 = scn.nextInt();
		
		if(valor>valor2) {
			System.out.println(valor + " é o maior");
		}
		else if(valor2>valor) {
			System.out.println(valor2 + " é maior");
		}
		if(valor==valor2)
			System.out.println("Impossivel ler esses valores ");
		
		scn.close();
	}
	
}
