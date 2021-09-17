package atividade;
import java.util.Scanner;
public class Ex27 {

/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores.*/	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int vl1 = scn.nextInt();
		System.out.print("Informe outro valor: ");
		int vl2 = scn.nextInt();
		System.out.print("Informe mais um valor: ");
		int vl3 = scn.nextInt();
		
		System.out.println();
		
		if(vl1>vl2 && vl2>vl3) {
			System.out.println(vl1 + vl2);
		}
		else if(vl2>vl1 && vl1>vl3) {
			System.out.println(vl2 + vl1);
		}
		if(vl3>vl1 && vl2>vl1) {
			System.out.println(vl3 + vl2);
		}
		else if(vl1>vl2 && vl3>vl2) {
			System.out.println(vl1 + vl3);
		}
		
		if(vl1==vl2 || vl1==vl3 || vl2==vl1 || vl2==vl3 || vl3==vl1 || vl3==vl2) {
			System.out.println("Não serão informados valores iguais");
		}
		scn.close();

	}

}
