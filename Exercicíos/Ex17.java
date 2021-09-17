package atividade;
import java.util.Scanner;
public class Ex17 {

/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a hora que começou o jogo: ");
		int comecou = scn.nextInt();
		System.out.print("Informe a hora que terminou o jogo: ");
		int fim = scn.nextInt();
		
		int duracao = fim - comecou;
		
		System.out.println("O jogo durou " + duracao + " Hrs");
		
		scn.close();

	}

}
