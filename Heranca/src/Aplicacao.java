
public class Aplicacao {

	public static void main(String[] args) {

	Veiculo veiculo = new Veiculo();
	
	veiculo.setMarca("Nissan");
	veiculo.setModelo("GTR");
	veiculo.setAno("2022");
	
	veiculo.imprimir();
	veiculo.buzinar();
	
	Carro carro = new Carro();
	
	carro.setMarca("Nissan");
	carro.setModelo("350z");
	carro.setAno("2000");
	carro.setQuatroPortas(true);
	
	System.out.println();
	
	carro.imprimir();
	carro.buzinar();
	
	Caminhao caminhao = new Caminhao();
	
	caminhao.setMarca("SCANIA");
	caminhao.setModelo("XJT76");
	caminhao.setAno("2020");
	
	System.out.println();
	
	caminhao.imprimir();
	caminhao.buzinar();
	
	Moto moto = new Moto();
	
	moto.setMarca("Honda");
	moto.setModelo("Hornet");
	moto.setAno(2022);
	
	System.out.println();
	
	moto.imprimir();
	moto.buzinar();
	moto.empinar();
	}
	

}
