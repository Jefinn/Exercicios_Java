package atividade;
import java.util.Scanner;
public class Ex07 {

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.*/ 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Informe seu salário: R$ ");
		double salario = scn.nextDouble();
		System.out.print("Informe seu numero de carros vendidos: ");
		int car = scn.nextInt();
		System.out.print("Informe o valor total de suas vendas: ");
		int vendascar = scn.nextInt();
		
		//Comissões
		System.out.print("Informe sua comissão: R$ ");
		double comissao = scn.nextDouble();//Lembrado-se que ele ganha uma comissão fixa para cada veiculo vendido.
		double maiscomissao = 0.05;//Mais 5% pela quantidade de vendas.
		double calcomissa = vendascar * maiscomissao;
		double calcomissa2 = calcomissa + comissao; 
		
		//Calculos
		double salariofinal = salario + calcomissa2;
		
		System.out.println("Seu salário final é: R$ " + salariofinal);
		
		scn.close();
		

	}

}
