
public class Bebida {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() { // boolean e a sua propria identidade,ele existe em si só. O valor padrão dele e false, ms tambem pode retornar como true
		return aquecer; // Return como a propria palavra ja diz e o retorno que vai ter, como dito no exercicio " Se bebida for leite" "esquentar bebida"
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
