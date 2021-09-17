package atividade;

import java.util.Scanner;

public class Ex28 {

/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e
escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.*/

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Informe um valor A: ");
		int A = scn.nextInt();
		System.out.print("Informe outro valor B: ");
		int B = scn.nextInt();
		System.out.print("Informe mais um valor C: ");
		int C = scn.nextInt();
		
		System.out.println();
		
		int resultado = A + B;
		int resultado2 = B + C;
		int resultado3 = A + C;
		
		if(resultado > C && resultado2 > A && resultado3 > B) {
			System.out.println("Forma-se um triângulo");
		}else
			System.out.println("Não forma-se triângulo");
		
		
		scn.close();

		}
	}
