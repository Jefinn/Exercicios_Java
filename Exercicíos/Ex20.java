package atividade;
import java.util.Scanner;
public class Ex20 {
	
/*Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu sal�rio total.*/	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe seu sal�rio: ");
		int salario = scn.nextInt();
		System.out.print("Informe o valor de suas vendas: ");
		int vendas = scn.nextInt();
		
		if(vendas>=1500) {
			double comissao = vendas * 0.03 + salario;
			System.out.println("Seu sal�rio total � R$" + comissao);
		}
		else if(vendas>1500) {
			double comissaoo = vendas * 0.05 + salario;
			System.out.println("Seu sal�rio total � R$" + comissaoo);
		}
		
		scn.close();

	}

}
