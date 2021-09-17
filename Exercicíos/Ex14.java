package atividade;
import java.util.Scanner;
public class Ex14 {

/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe o ano atual: ");
		int atual = scn.nextInt();
		System.out.print("Informe o ano que você nasceu: ");
		int ano = scn.nextInt();
		
		int calculo = atual - ano;
		
		if(calculo>=18) {
			System.out.println("Você podera votar esse ano! ");
		}else
			System.out.println("Você não podera votar esse ano! ");
		
		scn.close();

	}

}
