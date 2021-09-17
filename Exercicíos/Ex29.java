package atividade;
import java.util.Scanner;
public class Ex29 {

/*32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe o nome de um time: ");
		String time = scn.nextLine();
		System.out.println("Informe numero de gol(s): ");
		int gol = scn.nextInt();
		
		scn.nextLine();
		
		System.out.println("Informe o nome de outro time: ");
		String time2 = scn.nextLine();
		System.out.println("Informe numero de gol(s): ");
		int goll = scn.nextInt();
		
		if(gol>goll) {
			System.out.println(time + " é o vencendor ");
		}
		else if(goll>gol) {
			System.out.println(time2 + " é o vencedor ");
		}else
			System.out.println("Empatou");

		//TEM QUE ARRUMAR
		
		scn.close();

	}

}
