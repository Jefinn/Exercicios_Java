package atividade;
import java.util.Scanner;
public class Ex24 {

/*Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int vl1 = scn.nextInt();
		System.out.print("Informe outro valor: ");
		int vl2 = scn.nextInt();
		System.out.print("Informe mais um valor: ");
		int vl3 = scn.nextInt();
		
		if(vl1==vl2 || vl1==vl3 || vl2==vl1 || vl2==vl3 || vl3==vl1 || vl3==vl2) {
			System.out.println("Não serão informados valores iguais");
		}
		else if(vl1>vl2 & vl1>vl3) {
			System.out.println("Maior é " + vl1);
		}
		if(vl2>vl1 & vl2>vl3) {
			System.out.println("Maior é " + vl2);
		}
		else if(vl3>vl1 & vl3>vl2) {
			System.out.println("Maior é " + vl3);
		}
		scn.close();

	}

}
