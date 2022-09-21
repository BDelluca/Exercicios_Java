package ddd;

public class ClienteEx53 {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancariaEx53 conta;
	
	ClienteEx53()
	{
		
	}
	
	ClienteEx53(int id, String nome, int idade, String email, ContaBancariaEx53 conta)
	{
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	void atualizarEmail(String novoEmail)
	{
		this.email = novoEmail;
	}
	
	String exibirNomeIdade() 
	{
		return "Nome: " + this.nome + " \nIdade: " + this.idade;
	}
	
	String exibirDadosConta()
	{
		if(this.conta.numero == null)
		{
			return "Esse cliente nao possui conta!";
		}
		return "Agencia: " + this.conta.agencia + "\nNumero: " + this.conta.numero + "\nSaldo: " + this.conta.saldo;
	}
}
