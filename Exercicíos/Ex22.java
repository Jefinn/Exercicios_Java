package atividade;
import java.util.Scanner;
public class Ex22 {

/*Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e
quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade
m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual
a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar
compra'.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe sua quantidade em estoque: ");
		int estoque = scn.nextInt();
		System.out.print("Informe sua quantidade m�xima em seu estoque: ");
		int maxima = scn.nextInt();
		System.out.print("Informe sua quantidade minima em seu estoque: ");
		int minima = scn.nextInt();

		int media = (maxima + minima)/2;
		
		if(estoque>=media) {
			System.out.println("N�o efetue a compra");
		}else
			System.out.println("Efetue a compra");
		
		scn.close();

	}

}
