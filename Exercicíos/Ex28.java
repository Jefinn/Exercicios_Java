package atividade;

import java.util.Scanner;

public class Ex28 {

/* Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e
escrever se formam ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.*/

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
			System.out.println("Forma-se um tri�ngulo");
		}else
			System.out.println("N�o forma-se tri�ngulo");
		
		
		scn.close();

		}
	}
