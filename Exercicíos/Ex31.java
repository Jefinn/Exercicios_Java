package atividade;
import java.util.Scanner;
public class Ex31 {

/*35) Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
at� 20 litros, desconto de 3% por litro �lcool
acima de 20 litros, desconto de 5% por litro

at� 20 litros, desconto de 4% por litro Gasolina
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o pre�o do litro da gasolina � R$ 3,30 e o pre�o do litro do �lcool � R$ 2,90.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Informe que tipo de comb�stivel voc� quer colocar: \n A - �lcool \n G - gasolina ");
		char combust = scn.next().charAt(0);
		
		if(combust =='a'|| combust =='A') {
		
			System.out.println("Informe quantos litros voc� quer colocar: ");
			int litros = scn.nextInt();
			
			if(litros<=20) {
				double descA = 2.90 * 0.03;
				System.out.println("O valor a ser pago �: " + " R$ " + descA);
			}else if(litros>20) {
				double descAA = 2.90 * 0.05;
				System.out.println("O valor a ser pago �: " + " R$ " + descAA);
			}
		}
		
		if(combust == 'g'||combust == 'G') {
			System.out.println("Informe quantos litros voc� quer colocar: ");
			int litros = scn.nextInt();
			
			if(litros<=20) {
				double descG = 3.30 * 0.04;
				System.out.println("O valor a ser pago �: " + " R$ " + descG);
			}else if(litros>20) {
				double descGG = 3.30 * 0.06;
				System.out.println("O valor a ser pago �: " + " R$ " + descGG);
			}
		}
		
		scn.close();

	}

}
