package ddd;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0, a1 = 1, a2 = 0;
		for(int x = 0; x < 30; x++) {
			soma = a1 + a2;
			System.out.printf("\n%d", a1);
			a2 = a1;
			a1 = soma;
		}
	}

}
