
public class Endereco {

	private int num;     //determinando variavel e seu valor com visibilidade privada
	private String rua;
	private String bairro;

	
	//get e set são técnicas padronizadas para gerenciamento sobre o acesso dos atributos
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return " [num=" + num + ", rua=" + rua + ", bairro=" + bairro;
	}

	
	
	
}
