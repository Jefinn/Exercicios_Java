package atividade;
import java.util.Scanner;
public class Ex32 {

/*Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
das idades do homem mais velho com a mulher mais nova, e o produto da idades do homem mais
novo com a mulher mais velha.*/	
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Informe a idade de um homem: ");
	int idadeH = scn.nextInt();
	
	System.out.println("Informe a idade de outro homem: ");
	int idadeH2 = scn.nextInt();
	
		System.out.println("Informe a idade de uma mulher: ");
	int idadeF = scn.nextInt();
	
	System.out.println("Informe a idade de outra mulher: ");
	int idadeF2 = scn.nextInt();
	
	System.out.println();
	
	if(idadeH>idadeH2 && idadeF<idadeF2) {
		int soma = idadeH + idadeF;
		double produto = idadeH2 * idadeF2;
		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
		System.out.println("A soma do homem mais novo com a mulher mais velha é: " + produto);
	}
	
	else if(idadeH>idadeH2 && idadeF2<idadeF) {
		int soma = idadeH + idadeF2;
		double produto = idadeH2 * idadeF;
		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
		System.out.println("A soma do homem mais novo com a mulher mais velha é: " + produto);
    }
	
	if(idadeH2>idadeH && idadeF<idadeF2) {
		int soma = idadeH2 + idadeF;
		double produto = idadeH * idadeF2;
		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
		System.out.println("A soma do homem mais novo com a mulher mais velha é: " + produto);
	}
	
	else if(idadeH2>idadeH && idadeF2<idadeF) {
		int soma = idadeH2 + idadeF2;
		double produto = idadeH * idadeF;
		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
		System.out.println("A soma do homem mais novo com a mulher mais velha é: " + produto);
	}
	
	if(idadeH==idadeH2 || idadeF==idadeF2) {
		System.out.println("Impossível ler idades iguais! ");
	}
	
	scn.close();
	}

}
