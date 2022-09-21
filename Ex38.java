package ddd;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0, ant = 0;
		for(int x = 1; x <= 100; x++) {
			soma = x + ant;
			System.out.printf("\n%d + %d = %d",x, ant, soma);
			ant = soma;
		}
		System.out.printf("\nA soma dos numeros de 1 a 100 e %d", soma);
	}

}
