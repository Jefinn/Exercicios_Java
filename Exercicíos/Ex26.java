package atividade;
import java.util.Scanner;
public class Ex26 {

/*Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente.*/	
	
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
		System.out.println(vl1 + "\n" + vl2 + "\n" + vl3);
	}
	else if(vl2>vl1 && vl1>vl3) {
		System.out.println(vl2 + "\n" + vl1 + "\n" + vl3);
	}
	if(vl3>vl1 && vl2>vl1) {
		System.out.println(vl3 + "\n" + vl2 + "\n" + vl1);
	}
	
	
	else if(vl1==vl2 || vl1==vl3 || vl2==vl1 || vl2==vl3 || vl3==vl1 || vl3==vl2) {
		System.out.println("Não serão informados valores iguais");
	}
	scn.close();

	}

}
