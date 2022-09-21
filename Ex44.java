package ddd;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float userInput = 0, soma = 0, maior = 0;
		
		for(int x = 0; x < 10; x++) {
			do {
				System.out.printf("Digite um numero positivo (Numero aceitos ate o momento: %d): ", x);
				userInput = ler.nextFloat();
			}
			while(userInput <= 0);
			if(x == 0 || userInput > maior) {
				maior = userInput;
			}
			soma += userInput;
		}
		
		System.out.printf("A) O maior valor foi: %.2f\n", maior);
		System.out.printf("B) A soma dos valores foi: %.2f\n", soma);
		System.out.printf("C) A media dos valores foi: %.2f", (soma/10));
	}

}