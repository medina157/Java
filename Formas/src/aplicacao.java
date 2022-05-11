
public class aplicacao {

	public static void main(String[] args) {
	
		FormaGeometrica quadrado = new Quadrado();
		System.out.println("A área do quadrado é: " + quadrado.calcularArea(5));		
		System.out.println();
		
		FormaGeometrica circuferencia = new Circuferencia();
		System.out.println("A área da circuferencia é: " + circuferencia.calcularArea(5));
		System.out.println();
		
		FormaGeometrica retangulo = new Retangulo();
		System.out.println("A área do retangulo é: " + retangulo.calcularArea(5));
			}

}
