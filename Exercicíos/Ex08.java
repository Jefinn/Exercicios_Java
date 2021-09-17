package atividade;
import java.util.Scanner;
public class Ex08 {

/*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a temperatura em Fahrenheit: ");
		int farh = scn.nextInt();
		
		//Calculo
		int celsius = (farh - 32) * 5/9;

		System.out.println("O valor em graus Celsius é: " + celsius + "°C");
		
		scn.close();

	}

}
