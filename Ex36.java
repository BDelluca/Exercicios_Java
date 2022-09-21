package ddd;

import java.util.Scanner;

public class Ex36 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
			
		int x, a, b;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			x = ler.nextInt();
		}
		while(x <= 0);
		
		System.out.printf("Digite o primeiro valor do intervalo: ");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo valor do intervalo (deve ser maior que o primeiro valor): ");
			b = ler.nextInt();
		}
		while(b <= a);
		
		for(; b >= a; b--) {
			System.out.printf("\n%d X %d = %d", b, x, (b*x));
		}

	}

}
