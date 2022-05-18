import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
	

		Scanner cadastro = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		
		List<pessoa> ListaDePessoas = new ArrayList <Pessoas>();
		
		System.out.println("Digite seu nome");
		pessoa.Nome = cadastro.next();
		System.out.println("Digite sua idade");
		pessoa.Idade = cadastro.nextInt();
		System.out.println("Digite seu endereço (Rua)");
		endereco.Rua = cadastro.next();
		System.out.println("Digite seu endereco (Numero)");
		endereco.numero = cadastro.nextInt();
		System.out.println("Digite seu endereco (Bairro)");
		

		
		
		
		
	}

}
