package atividade;
import java.util.Scanner;
public class Ex20 {
	
/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.*/	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe seu salário: ");
		int salario = scn.nextInt();
		System.out.print("Informe o valor de suas vendas: ");
		int vendas = scn.nextInt();
		
		if(vendas>=1500) {
			double comissao = vendas * 0.03 + salario;
			System.out.println("Seu salário total é R$" + comissao);
		}
		else if(vendas>1500) {
			double comissaoo = vendas * 0.05 + salario;
			System.out.println("Seu salário total é R$" + comissaoo);
		}
		
		scn.close();

	}

}
