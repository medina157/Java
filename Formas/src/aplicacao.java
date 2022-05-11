
public class aplicacao {

	public static void main(String[] args) {
	
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 5;
		System.out.println("A área do quadrado é: " + quadrado.calcularArea());		
		System.out.println();
		
		Circuferencia circuferencia = new Circuferencia();
		circuferencia.raio = 5;
		System.out.println("A área da circuferencia é: " + circuferencia.calcularArea());
		System.out.println();
		
		Retangulo retangulo = new Retangulo();
		retangulo.x = 2;
		retangulo.y = 3;
		System.out.println("A área do retangulo é: " + retangulo.calcularArea());
			}

}
