package atividade;
import java.util.Scanner;
public class Ex12 {

/*As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e
escreva o custo total da compra.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		double und = 1.30;
		double duzia = 1.00;
		
		System.out.println("Informe o numero de ma�a que voc� quer comprar: ");
		int numero = scn.nextInt();
		
		if(numero<=11) {
			double calculo = und * numero;
			System.out.println("Valor total � R$ " + calculo);
		}
		else if(numero>=12) {
			double calculo2 = duzia * numero;
			System.out.println("Valor total � R$ " + calculo2);
		}
			
		
		scn.close();

	}

}
