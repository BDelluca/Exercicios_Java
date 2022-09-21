package ddd;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ClienteEx53[] listaDeClientes = new ClienteEx53[5];
		for(int x = 0; x < 5; x++)
		{
			ClienteEx53 cliente = new ClienteEx53();
			ContaBancariaEx53 conta = new ContaBancariaEx53();
			Character resposta;
			cliente.id = x+1;
			System.out.printf("Insira o seu nome: ");
			cliente.nome = ler.next();
			System.out.printf("Insira a sua idade: ");
			cliente.idade = ler.nextInt();
			System.out.printf("Insira o seu email: ");
			cliente.email = ler.next();
			System.out.printf("Voce possui conta bancaria? (S/N): ");
			resposta = ler.next().charAt(0);
			if(resposta == 's' || resposta == 'S')
			{
				System.out.printf("Insira a agencia: ");
				conta.agencia = ler.next();
				System.out.printf("Insira o numero: ");
				conta.numero = ler.next();
				System.out.printf("Insira o saldo: ");
				conta.saldo = ler.nextDouble();
			}
			cliente.conta = conta;
			listaDeClientes[x] = cliente;
		}
		for(int y = 0; y < 5; y++) 
		{
			System.out.printf(listaDeClientes[y].exibirNomeIdade() + "\n");
			System.out.printf(listaDeClientes[y].exibirDadosConta() + "\n");
		}
	}

}
