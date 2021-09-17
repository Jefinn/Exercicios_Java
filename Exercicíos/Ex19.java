package atividade;
import java.util.Scanner;
public class Ex19 {

/*Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém
erros, identifique os erros no algoritmo apresentado abaixo: 

Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
e mostre seu peso ideal, utilizando as seguintes fórmulas:

- para sexo masculino: peso ideal = (72.7 * altura) - 58
- para sexo feminino: peso ideal = (62.1 * altura) - 44.7*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe seu nome:");
		String nome = scn.next();
		System.out.print("Informe sua altura: ");
		double altura = scn.nextDouble();
		System.out.print("Informe seu sexo: ");
		String sexo = scn.next();
		System.out.print("Informe seu sexo oposto: ");
		String sexos = scn.next();
		
		double tamanho = altura / 100;
		
		System.out.println();

		if(sexo!=sexos) {
			double idealM = 72.7 * tamanho - 58;
			System.out.println("Olá " + nome + " Seu peso ideal é " + idealM);
		}
		else if(sexos!=sexo) {
		    double idealF = 62.1 * tamanho - 44.7;
		    System.out.println("Olá " + nome + " seu peso ideal é " + idealF);
		}
		
		
		scn.close();
	}

}
