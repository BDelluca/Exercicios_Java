package ddd;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int soma=0;
		System.out.printf("Insira o numero inicial: ");
		int ninicial = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		int nfinal = ler.nextInt();
		while(nfinal <= ninicial) 
		{
			System.out.printf("O numero final deve ser maior que o inicial: ");
			nfinal = ler.nextInt();
		}
		for(int x = ninicial; x <= nfinal; x++) 
		{
			soma+=x;
		}
		System.out.printf("A soma da sequencia de numeros entre %d e %d e: %d", ninicial, nfinal, soma);
	}

}