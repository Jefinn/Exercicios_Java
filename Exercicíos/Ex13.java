package atividade;
import java.util.Scanner;
public class Ex13 {

/*Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever
uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o
aluno � aprovado). Escrever tamb�m a m�dia calculada.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe a nota da sua 1� avalia��o: ");
		double nt1 = scn.nextDouble();
		System.out.print("Informe a nota da sua 2� avalia��o: ");
		double nt2 = scn.nextDouble();
		
		double media = nt1 * nt2 / 2;
		
		if(media>=6) {
			System.out.println("Parab�ns voc� foi aprovado!");
		}else
			System.out.println("Infelizmente, voc� foi reprovado!");
		
		scn.close();

	}

}
