
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rota rota = new Rota();
		Ferrari ferrari= new Ferrari();
		Uno uno = new Uno();
		
		rota.ir(uno);
		System.out.println();
		rota.ir(ferrari);
		System.out.println();
		
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		System.out.println();
		automovel = new Uno ();
		rota.ir(automovel);
		System.out.println();
	
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
