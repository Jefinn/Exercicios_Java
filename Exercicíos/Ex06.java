package atividade;
import java.util.Scanner;
public class Ex06 {

/*O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
calcular e escrever o custo final ao consumidor.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		double distribuidor = 0.28; 
		double imposto = 0.45;
		
		System.out.print("Informe o valor de f�brica de seu carro: R$ ");
		int valor = scn.nextInt();
		
		//Calculo
		double caldistribuidor = valor*distribuidor;
		double calimposto = valor*imposto;
		double soma = valor + caldistribuidor + calimposto; 
		
		System.out.print("O custo final do carro � R$ " + soma);
		
		scn.close();

	}

}
