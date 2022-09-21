package ddd;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro valor: ");
        v1 = ler.nextInt();
       
        do {
        	System.out.printf("Digite um valor maior que o anterior: ");
            v2 = ler.nextInt();
        }
        while(v2 <= v1);

	}

}
