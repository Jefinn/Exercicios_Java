package atividade;
import java.util.Scanner;
public class Ex09 {

/*Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia
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
		
		System.out.println("Sua m�dia final �: " + media);
		
		scn.close();
		
	

	}

}
