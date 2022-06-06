import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {

		try (Scanner entrada = new Scanner(System.in)) { // Scanner para separar a entrada dos textos,comm isso gera tokens
			List<Pessoa> lista = new ArrayList<Pessoa>();    //List e uma interface e arrayList e a classe que a implementa

			for (int x = 0; x < 4; x++) {    // e um laço de repetição que tem que determinar a quantidade de vezes que ele ira se repetir

				Pessoa pessoa = new Pessoa();
				pessoa.setEndereco(new Endereco());

				System.out.println("Cadastre-se");
				System.out.print("Digite seu nome: ");
				pessoa.setNome(entrada.next());

				System.out.print("Digite sua idade: ");
				pessoa.setIdade(entrada.nextInt());

				System.out.print("Digite seu sexo 1-Masculino 2-Feminino: 1");
				int opcao = 0;
				while (opcao != 1 && opcao != 2) {     //while e o laço repetição que enquanto o valor seja digitado errado ele vai voltar ate digitar o valor correto
					opcao = entrada.nextInt();
					if (opcao == 1)
						pessoa.setSexo(Sexo.MASCULINO);

					else if (opcao == 2)
						pessoa.setSexo(Sexo.FEMININO);
					else {
						System.out.println("Esse sexo não existe");
						System.out.println("Digite seu sexo 1-Masculino 2-Feminino");
					}
				}
				System.out.print("Digite onde bairro onde você mora: ");
				pessoa.getEndereco().setBairro(entrada.next());

				System.out.print("Digite o nome da rua onde você mora: ");
				pessoa.getEndereco().setRua(entrada.next());

				System.out.print("Digite o numero de sua casa: ");
				pessoa.getEndereco().setNum(entrada.nextInt());
				System.out.println();

				lista.add(pessoa);
			}

			for (Object valor : lista) {
				System.out.println(valor);
			}
			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
				for (Pessoa Pessoa : lista) {
					escrever.write(Pessoa.toString());

				}
				try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
					String line;     //ele inclui comandos para liberar recursos que podem ter sido alocados

					while ((line = reader.readLine()) != null) {
						Pessoa pessoa = new Pessoa(line);

					}
					
				}
			}
		}
	}
}
