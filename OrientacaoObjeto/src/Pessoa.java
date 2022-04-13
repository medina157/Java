
public class Pessoa {

	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;	
	}
	
	void dar(int numFigurinhas, Pessoa pessoa) {
		
		if (this.numFigurinhas < numFigurinhas) {
			System.out.println(" ");
			System.out.println("Você Não tem a quantidade de figurinhas necessárias e nao podera dar figuinhas para " + pessoa.nome);
			System.out.println("");
			System.out.println("Então ");
		  }
			else {		

				this.numFigurinhas -= numFigurinhas;
				
				pessoa.receber(numFigurinhas);
				System.out.println("");
				System.out.println("Você tem a quantidade de figurinhas necessárias e poderá dar figurinhas para " + pessoa.nome);
				System.out.println("");
				System.out.println("Então");
		}
	}
	
	
}
