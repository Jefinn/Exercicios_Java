package atividade;
import java.util.Scanner;
public class Ex04 {

/*Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos
brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total
de eleitores.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe numero total de eleitores de seu munic�pio: ");
		int eleitores = scn.nextInt();
		System.out.print("Informe numero total de votos em brancos: ");
		int brancos = scn.nextInt();
		System.out.print("Informe numero total de votos em nulos: ");
		int nulos = scn.nextInt();
		System.out.print("Informe numero total de votos em v�lidos: ");
		int validos = scn.nextInt();
		
		//Calculos
		int branco = (eleitores/brancos)*100;
		int nulo = (eleitores/nulos)*100;
		int valido = (eleitores/validos)*100;
		
		System.out.println();
		
		System.out.println("Total de eleitores � " + eleitores);
		System.out.println("O percentual em votos em brancos � " + branco + "%");
		System.out.println("O percentual em votos em nulos � " + nulo + "%");
		System.out.println("O percentual em votos em validos � " + valido + "%");
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
		scn.close();

	}

}
