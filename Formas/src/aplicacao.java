
public class aplicacao {

	public static void main(String[] args) {
	
		FormaGeometrica quadrado = new Quadrado();
		System.out.println("A �rea do quadrado �: " + quadrado.calcularArea(5));		
		System.out.println();
		
		FormaGeometrica circuferencia = new Circuferencia();
		System.out.println("A �rea da circuferencia �: " + circuferencia.calcularArea(5));
		System.out.println();
		
		FormaGeometrica retangulo = new Retangulo();
		System.out.println("A �rea do retangulo �: " + retangulo.calcularArea(5));
			}

}
