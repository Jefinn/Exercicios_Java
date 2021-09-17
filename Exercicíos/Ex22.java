package atividade;
import java.util.Scanner;
public class Ex22 {

/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe sua quantidade em estoque: ");
		int estoque = scn.nextInt();
		System.out.print("Informe sua quantidade máxima em seu estoque: ");
		int maxima = scn.nextInt();
		System.out.print("Informe sua quantidade minima em seu estoque: ");
		int minima = scn.nextInt();

		int media = (maxima + minima)/2;
		
		if(estoque>=media) {
			System.out.println("Não efetue a compra");
		}else
			System.out.println("Efetue a compra");
		
		scn.close();

	}

}
