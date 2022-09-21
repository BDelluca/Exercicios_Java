package ddd;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoEx52[] listaProdutos = new ProdutoEx52[10];
		Scanner ler = new Scanner(System.in);
		for(int x = 0; x < 10; x++) 
		{
			ProdutoEx52 produto = new ProdutoEx52();
			produto.id = x+1;
			System.out.printf("Insira a quantidade: ");
			produto.quantidade = ler.nextDouble();
			System.out.printf("Insira o valor: ");
			produto.valor = ler.nextDouble();
			System.out.printf("Insira a Descricao: ");
			produto.descricao = ler.next();
			listaProdutos[x] = produto;
		}
		System.out.printf("Os seguintes produtos custam menos de 100 reais: \n");
		for(int y = 0; y < 10; y++) 
		{
			if(listaProdutos[y].valor < 100) 
			{
				System.out.printf("Id: %d Descricao: %s Valor: %.2f quantidade: %.2f\n", listaProdutos[y].id, listaProdutos[y].descricao, listaProdutos[y].valor, listaProdutos[y].quantidade);
			}
			
		}
	}

}
