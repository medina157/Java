
public class Contador {

	private static  int valor;

//	public Contador() {
//		this.valor = 1
//	}
	static { //faz que a informaão fique estatica, e da pra imolementar novos valores 
		valor = 1;
	}
	
	public static void incrementar() {
		valor ++;
	}
	
	
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) { //modifica o valor da variavel
		this.valor = valor;
	}
	
	
	
	
}
