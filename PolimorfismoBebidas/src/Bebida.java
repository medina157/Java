
public class Bebida {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void preparar() {
		System.out.println("Pegando o copo");
		
	}
	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}

	private String nome;
	private boolean aquecer;
	
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	
}
