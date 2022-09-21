package ddd;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			a = ler.nextInt();
		}
		while(a < 0);
		
		
	}

}
