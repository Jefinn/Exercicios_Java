package atividade;
import java.util.Scanner;
public class Ex06 {

/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		double distribuidor = 0.28; 
		double imposto = 0.45;
		
		System.out.print("Informe o valor de fábrica de seu carro: R$ ");
		int valor = scn.nextInt();
		
		//Calculo
		double caldistribuidor = valor*distribuidor;
		double calimposto = valor*imposto;
		double soma = valor + caldistribuidor + calimposto; 
		
		System.out.print("O custo final do carro é R$ " + soma);
		
		scn.close();

	}

}
