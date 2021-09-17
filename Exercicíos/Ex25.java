package atividade;
import java.util.Scanner;
public class Ex25 {

/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores.*/	
	
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int vl1 = scn.nextInt();
		System.out.print("Informe outro valor: ");
		int vl2 = scn.nextInt();
		System.out.print("Informe mais um valor: ");
		int vl3 = scn.nextInt();
		
		if((vl1<vl2 && vl2<vl3)||(vl1<vl3 && vl2<vl3)) {
			int soma = vl2 + vl3;
			System.out.println("A soma dos valores são: " + soma);
		}
		else if((vl2<vl1 && vl1<vl3)||(vl2<vl3 && vl3<vl1)) {
			int soma = vl1 + vl3;
			System.out.println("A soma dos valores são: " + soma);
		}
		if((vl3<vl2 && vl1<vl2)||(vl3<vl2 && vl2<vl1)) {
			int soma = vl1 + vl2;
			System.out.println("A soma dos valores são: " + soma);
		}
		
		else if(vl1==vl2 || vl1==vl3 || vl2==vl1 || vl2==vl3 || vl3==vl1 || vl3==vl2) {
			System.out.println("Não serão informados valores iguais");
		}
		

		scn.close();
	}

}
