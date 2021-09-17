package atividade;
import java.util.Scanner;
public class Ex21 {

/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe o numero da sua conta: ");
		int conta = scn.nextInt();
		System.out.print("Informe seu saldo: ");
		int saldo = scn.nextInt();
		System.out.print("Informe o seu saldo em débito: ");
		int debito = scn.nextInt();
		System.out.print("Informe seu saldo em crédito: ");
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
