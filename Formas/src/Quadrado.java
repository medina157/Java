
public class Quadrado implements FormaGeometrica{
	
	double lado;
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2);
	}
}
