package atividade;
import java.util.Scanner;
public class Ex04 {

/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe numero total de eleitores de seu município: ");
		int eleitores = scn.nextInt();
		System.out.print("Informe numero total de votos em brancos: ");
		int brancos = scn.nextInt();
		System.out.print("Informe numero total de votos em nulos: ");
		int nulos = scn.nextInt();
		System.out.print("Informe numero total de votos em válidos: ");
		int validos = scn.nextInt();
		
		//Calculos
		int branco = (eleitores/brancos)*100;
		int nulo = (eleitores/nulos)*100;
		int valido = (eleitores/validos)*100;
		
		System.out.println();
		
		System.out.println("Total de eleitores é " + eleitores);
		System.out.println("O percentual em votos em brancos é " + branco + "%");
		System.out.println("O percentual em votos em nulos é " + nulo + "%");
		System.out.println("O percentual em votos em validos é " + valido + "%");
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
		scn.close();

	}

}
