package atividade;
import java.util.Scanner;
public class Ex16 {

/*Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("Informe um valor: ");
		int valor = scn.nextInt();
		System.out.print("Informe outro valor: ");
		int valor2 = scn.nextInt();
		
		if(valor>valor2) {
			System.out.println(valor + "\n" + valor2);
		}
		else if(valor2>valor) {
			System.out.println(valor2 + "\n" + valor);
		}
		
		System.out.println();
		
		if(valor==valor2)
			System.out.println("Impossivel ler esses valores ");

		scn.close();

	}

}
