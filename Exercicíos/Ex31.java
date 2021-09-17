package atividade;
import java.util.Scanner;
public class Ex31 {

/*35) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
até 20 litros, desconto de 3% por litro Álcool
acima de 20 litros, desconto de 5% por litro

até 20 litros, desconto de 4% por litro Gasolina
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Informe que tipo de combústivel você quer colocar: \n A - álcool \n G - gasolina ");
		char combust = scn.next().charAt(0);
		
		if(combust =='a'|| combust =='A') {
		
			System.out.println("Informe quantos litros você quer colocar: ");
			int litros = scn.nextInt();
			
			if(litros<=20) {
				double descA = 2.90 * 0.03;
				System.out.println("O valor a ser pago é: " + " R$ " + descA);
			}else if(litros>20) {
				double descAA = 2.90 * 0.05;
				System.out.println("O valor a ser pago é: " + " R$ " + descAA);
			}
		}
		
		if(combust == 'g'||combust == 'G') {
			System.out.println("Informe quantos litros você quer colocar: ");
			int litros = scn.nextInt();
			
			if(litros<=20) {
				double descG = 3.30 * 0.04;
				System.out.println("O valor a ser pago é: " + " R$ " + descG);
			}else if(litros>20) {
				double descGG = 3.30 * 0.06;
				System.out.println("O valor a ser pago é: " + " R$ " + descGG);
			}
		}
		
		scn.close();

	}

}
