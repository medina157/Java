
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Medina";
		pessoa1.numFigurinhas = 1;
	
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome + " tem " + pessoa1.numFigurinhas + " figurinhas ");
		
		System.out.println("E");
		
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "mdn";
		pessoa2.numFigurinhas = 2;
		
		System.out.println(pessoa2.nome + " tem " + pessoa2.numFigurinhas + " figurinhas ");
	
		
		pessoa1.dar(5, pessoa2);
	
		System.out.println(pessoa1.nome + " ficou com " + pessoa1.numFigurinhas + " figurinhas ");
	
		System.out.println("E");
		
		System.out.println(pessoa2.nome + " ficou com " + pessoa2.numFigurinhas + " figurinhas ");
		
		
		
		
		
	}

}
