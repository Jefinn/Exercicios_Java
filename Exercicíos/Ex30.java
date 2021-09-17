package atividade;
import java.util.Scanner;
public class Ex30 {
	
/*Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro.*/	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int val = scn.nextInt();
		System.out.println("Informe outro valor: ");
		int val2 = scn.nextInt();
		
		if(val==val2) {
			System.out.println("Numeros Iguais");
		}
		else if(val>val2) {
			System.out.println("Primeiro é maior");
		}else
			System.out.println("O Segundo é maior");

		scn.close();

	}

}
