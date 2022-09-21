package ddd;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			a = ler.nextInt();
		}
		while(a <= 0);
		for(int x = 1; x <= 10; x++) {
			System.out.printf("\n%d X %d = %d", x, a, (x*a));
		}

	}

}
