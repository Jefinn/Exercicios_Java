package atividade;
import java.util.Scanner;
public class Ex18 {
	
/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).*/	

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe suas horas trabalhada nesse mês: ");
		float trabalho = scn.nextFloat();
		System.out.print("Informe seu salário por horas trabalhadas: ");
		float hrssalario = scn.nextFloat();
		
		if(trabalho>40) {
			double acrescimo = hrssalario * 0.5;
			double extra = hrssalario + acrescimo;
      		System.out.println("Seu salário total é " + extra);
		}
		else if(trabalho<=40) {
			System.out.println("Seu salário total é " + hrssalario);
			
		}
		
		scn.close();
		
		

	}

}
