package atividade;
import java.util.Scanner;
public class Ex09 {

/*Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe sua nota1: ");
		double n1 = scn.nextDouble();
		System.out.print("Informe sua nota2: ");
		double n2 = scn.nextDouble();
		System.out.print("Informe sua nota3: ");
		double n3 = scn.nextDouble();
		
		//Calculo
		double media = (n1 * 2 + n2 * 3 + n3 * 5)/10;
		
		System.out.println("Sua média final é: " + media);
		
		scn.close();
		
	

	}

}
