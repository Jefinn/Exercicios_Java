package atividade;
import java.util.Scanner;
public class Ex10 {

/*Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso
contr�rio escrever N�O � MAIOR QUE 10!*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int valor = scn.nextInt();
		
		if(valor>10) {
			System.out.println("� maior que 10");
		}
		else {
			System.out.println("N�o � maior que 10");
		}
		
		scn.close();
	}

}
