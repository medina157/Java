
public class aplicacao {

	public static void main(String[] args) {
	
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 5;
		System.out.println("A �rea do quadrado �: " + quadrado.calcularArea());		
		System.out.println();
		
		Circuferencia circuferencia = new Circuferencia();
		circuferencia.raio = 5;
		System.out.println("A �rea da circuferencia �: " + circuferencia.calcularArea());
		System.out.println();
		
		Retangulo retangulo = new Retangulo();
		retangulo.x = 2;
		retangulo.y = 3;
		System.out.println("A �rea do retangulo �: " + retangulo.calcularArea());
			}

}
