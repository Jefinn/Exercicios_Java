package atividade;
import java.util.Scanner;
public class Ex13 {

/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe a nota da sua 1° avaliação: ");
		double nt1 = scn.nextDouble();
		System.out.print("Informe a nota da sua 2° avaliação: ");
		double nt2 = scn.nextDouble();
		
		double media = nt1 * nt2 / 2;
		
		if(media>=6) {
			System.out.println("Parabéns você foi aprovado!");
		}else
			System.out.println("Infelizmente, você foi reprovado!");
		
		scn.close();

	}

}
