package atividade;
import java.util.Scanner;
public class Ex21 {

/*Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e
escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o numero da sua conta: ");
		int conta = scn.nextInt();
		System.out.print("Informe seu saldo: ");
		int saldo = scn.nextInt();
		System.out.print("Informe o seu saldo em d�bito: ");
		int debito = scn.nextInt();
		System.out.print("Informe seu saldo em cr�dito: ");
		int credito = scn.nextInt();
		
		int saldoatual = saldo - debito + credito;
		
		System.out.println();
		
		if(saldoatual>=0) {
			System.out.println("Seu saldo positivo");
		}else
			System.out.println("Seu saldo negativo");
		
		scn.close();

	}

}
