package atividade;
import java.util.Scanner;
public class Ex10 {

/*Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int valor = scn.nextInt();
		
		if(valor>10) {
			System.out.println("É maior que 10");
		}
		else {
			System.out.println("Não é maior que 10");
		}
		
		scn.close();
	}

}
