
public class Endereco {

	private int num;
	private String rua;
	private String bairro;
	
	

	public Endereco(String[] arrayLinha) {   //guarda informções de um modo ordenado
		String[] arrayNum = arrayLinha[0].split("=");
		this.num = Integer.parseInt(arrayNum[1].trim());
		
		String[] arrayRua = arrayLinha[0].split("=");
		this.rua = arrayRua[1].trim();
		
		String[] arrayBairro = arrayLinha[0].split("=");
		this.bairro = arrayBairro[1].trim();
		
	}
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
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
		return " ,num=" + num + ", rua=" + rua + ", bairro=" + bairro; //retorno de como aparecera para o usuario
	}

	
	
	
}

