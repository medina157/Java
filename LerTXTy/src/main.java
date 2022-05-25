import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){	//BufferedReader le uma memoria temporaria // FileReader le e escreve ela em Reader
		
			String  line;
			String string = "";
			
			while ((line = reader.readLine())!= null) {
				string += line + "\n";		
			}
			System.out.println(string);
		}
		Sabonete sabonete1 = new Sabonete("Azedo", "verde");
		String s = sabonete1.toString();
		
		String teste = "Sabonete: Cheiro=Azedo, cor=verde";
		
		Sabonete sabonete2 = new  Sabonete(teste);
		
		System.out.println(sabonete2);
	
	}

}
