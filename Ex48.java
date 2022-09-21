package ddd;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.printf("Insira um numero: ");
		int n = ler.nextInt();
		for(int x = 1; x < 21; x++) 
		{
			System.out.printf("%d\n", n+x);
		}
	}

}