
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item= new Item();
		
		Item item = new Cogumelo(); // criação da palavara item e instanciamento de cogumelo;
		item.pegar(); //Chamando o metodo pegar
		
		item = new Moeda(); // Instanciamento de moeda
		item.pegar(); // Chamando o metodo pegar
		
		item = new Diamante(); // instanciamento de diamante
		item.pegar(); // Chamando o metodo pegar

	}

}
