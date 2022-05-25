import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		
		Sabonete sabonete1 = new Sabonete("Doce", "azul");
		Sabonete sabonete2 = new Sabonete("Lavanda", "rosa");
		Sabonete sabonete3 = new Sabonete("melancia", "vermelho");
		
		List<Sabonete> ListaDeSabonete = new ArrayList<Sabonete>();
		
		ListaDeSabonete.add(sabonete1);
		ListaDeSabonete.add(sabonete2);
		ListaDeSabonete.add(sabonete3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){ //bufferedWriter escreve em uma memoria temporaria
			for(Sabonete Sabonete : ListaDeSabonete) {
			escrever.write(Sabonete.toString());
		
			
		}

		}
	}

}

