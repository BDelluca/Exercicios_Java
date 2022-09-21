package ddd;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		for(int x = 1; x <= 20; x++) {
			System.out.printf("\nTabuado do %d", x);
			for(int y = 1; y <= 10; y++) {
				System.out.printf("\n%d X %d = %d", y, x, (y*x));
			}
		System.out.println("\nPress Enter to continue");
		ler.nextLine();
		}
	}

}
