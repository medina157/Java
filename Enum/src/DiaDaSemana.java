
public enum DiaDaSemana { //enum sao opções pré definidas

	//dias da semana e valores do indice que teve que colocar quando criou o construtor
	
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);

	public int getNum() {
		return num;
	}

	private int num;

	private DiaDaSemana(int num) {
		this.num = num;	
	}
	
	
}
