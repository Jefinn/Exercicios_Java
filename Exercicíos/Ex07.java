package atividade;
import java.util.Scanner;
public class Ex07 {

/*Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
vendedor.*/ 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe seu sal�rio: R$ ");
		double salario = scn.nextDouble();
		System.out.print("Informe seu numero de carros vendidos: ");
		int car = scn.nextInt();
		System.out.print("Informe o valor total de suas vendas: ");
		int vendascar = scn.nextInt();
		
		//Comiss�es
		System.out.print("Informe sua comiss�o: R$ ");
		double comissao = scn.nextDouble();//Lembrado-se que ele ganha uma comiss�o fixa para cada veiculo vendido.
		double maiscomissao = 0.05;//Mais 5% pela quantidade de vendas.
		double calcomissa = vendascar * maiscomissao;
		double calcomissa2 = calcomissa + comissao; 
		
		//Calculos
		double salariofinal = salario + calcomissa2;
		
		System.out.println("Seu sal�rio final �: R$ " + salariofinal);
		
		scn.close();
		

	}

}
