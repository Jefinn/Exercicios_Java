package atividade;
import java.util.Scanner;
public class Ex18 {
	
/*A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais
de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva
o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o m�s possua 4 semanas exatas).*/	

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe suas horas trabalhada nesse m�s: ");
		float trabalho = scn.nextFloat();
		System.out.print("Informe seu sal�rio por horas trabalhadas: ");
		float hrssalario = scn.nextFloat();
		
		if(trabalho>40) {
			double acrescimo = hrssalario * 0.5;
			double extra = hrssalario + acrescimo;
      		System.out.println("Seu sal�rio total � " + extra);
		}
		else if(trabalho<=40) {
			System.out.println("Seu sal�rio total � " + hrssalario);
			
		}
		
		scn.close();
		
		

	}

}
