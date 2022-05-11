
public abstract class Item {
	
	private int posX; // Criando a variável privada do tipo inteiro
	 private int posY; // Criando a variável privada do tipo inteiro
	 
	 public  void pegar() { // Tudo que extend de item tem que implementar o codigo abstrato
		 
	 }

	public int getPosX() { 
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	
	
	 
} 




