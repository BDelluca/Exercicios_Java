package ddd;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ClienteEx51[] listaClientes = new ClienteEx51[5];
		for(int x = 0; x < 5; x++) 
		{
			ClienteEx51 cliente = new ClienteEx51();
			cliente.id = x+1;
			System.out.printf("Insira o Email: ");
			cliente.email = ler.next();
			System.out.printf("Insira a Idade: ");
			cliente.idade = ler.nextInt();
			System.out.printf("Insira o Nome: ");
			cliente.nome = ler.next();
			listaClientes[x] = cliente;
		}
		System.out.printf("Os seguintes clientes tem mais de 18 anos: \n");
		for(int y = 0; y < 5; y++) 
		{
			if(listaClientes[y].idade > 18) 
			{
				System.out.printf("Id: %d Nome: %s Idade: %d Email: %s\n", listaClientes[y].id, listaClientes[y].nome, listaClientes[y].idade, listaClientes[y].email);
			}
			
		}
	}

}
