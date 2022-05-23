
public class main {

	public static final double PI = 3.14; //a palavra final determina que e uma constante 
	
	private enum Sexo{
		MASCULINO,FEMININO
	}
	
	
	public static void main(String[] args) {
	
		double pi = main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num); // mostra a variavel que conta com "segunda"
	
		String s = "TERCA"; //Guarda terca em "s"
		
		hoje = DiaDaSemana.valueOf(s); 
	
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = sexo.MASCULINO;
	}

}
