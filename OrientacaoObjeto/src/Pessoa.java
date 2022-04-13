
public class Pessoa {

	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;	
	}
	
	void dar(int numFigurinhas, Pessoa pessoa) {
		
		if (this.numFigurinhas < numFigurinhas) {
			System.out.println(" ");
			System.out.println("Voc� N�o tem a quantidade de figurinhas necess�rias e nao podera dar figuinhas para " + pessoa.nome);
			System.out.println("");
			System.out.println("Ent�o ");
		  }
			else {		

				this.numFigurinhas -= numFigurinhas;
				
				pessoa.receber(numFigurinhas);
				System.out.println("");
				System.out.println("Voc� tem a quantidade de figurinhas necess�rias e poder� dar figurinhas para " + pessoa.nome);
				System.out.println("");
				System.out.println("Ent�o");
		}
	}
	
	
}
