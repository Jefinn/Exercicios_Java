package atividade;
import java.util.Scanner;
public class Ex33 {

/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:

Até 5 Kg                    Acima de 5 Kg
Morango R$ 2,50 por Kg      R$ 2,20 por Kg
Maçã R$ 1,80 por Kg         R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe quantos kg de maça você quer comprar: ");
		int quant = scn.nextInt();
		
		if(quant<=5) {
			double cal = 1.80 * quant;
			System.out.println("O valor pago pelas maça é R$ " +  cal);
		}
		else if(quant>5 && quant<=7) {
			double cal = 1.50 * quant;
			System.out.println("O valor pago pelas maça é R$ " +  cal);
		}
		
		System.out.println();
		
		System.out.println("Informe quantos kg de morango você quer comprar: ");
		int quant2 = scn.nextInt();	
		
		if(quant2<=5) {
			double cal = 2.50 * quant2;
			System.out.println("O valor pago pelas morango é R$ " +  cal);
		}
		else if(quant2>5 && quant<=7) {
			double cal = 2.30 * quant2;
			System.out.println("O valor pago pelas morango é R$ " +  cal);
		}
		
		double total = 0;
		if(quant2>=8 || total>25) {
			
			double cal = (1.50 * 0.1) * quant * quant;
			double cal2 = (2.30 * 0.1) * quant * quant;
			double soma = cal + cal2;
			
			System.out.println("O preço pagos pelas frutas é R$ " + soma);
		}
	
		scn.close();

	}

}
