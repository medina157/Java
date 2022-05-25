import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try (Scanner scanner = new Scanner(System.in)) {
			String string = "";
			
			System.out.println("Digite aqui\n");
			string = scanner.nextLine();
			
			try(BufferedWriter escrever = new BufferedWriter(new FileWriter("menu.txt"))){
				escrever.write(string);
}

	
			try(BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))){	
				
				String  line;
				String string1 = "";

			
				
				while ((line = reader.readLine())!= null) {
					string1 += line + "\n";		
				}
				System.out.println(string);
				System.out.println("salvo em menu com sucesso");
			}
		}
	}
}
