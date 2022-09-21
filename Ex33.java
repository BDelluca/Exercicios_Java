package ddd;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		char x;
       
        do {
        	System.out.printf("Digite seu sexo (F/M): ");
            x = ler.next().charAt(0);
        }
        while(x != 'F' && x != 'M');
	}

}
