
public class Sabonete {

	String cheiro;
	String cor;
	Sabonete(String cheiro, String cor) {
	
		this.cheiro = cheiro;
		this.cor = cor;
	}
	public String getCheiro() {
		return cheiro;
	}
	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Sabonete[cheiro=" + cheiro + ", cor=" + cor + "]\n";
	}

	
	
}
