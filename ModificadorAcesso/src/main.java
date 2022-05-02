
	public class main {


	public static void main(String[] args) {
	
				ContaBancaria conta1 = new ContaBancaria();

//				conta1.ativo = true;
//				conta1.numConta = 1234;
//				conta1.saldo = 100.50;
//				
//				
//				System.out.println(conta1.ativo);
//				System.out.println(conta1.numConta);
//				System.out.println(conta1.saldo);
		//
//
//				conta1.receber(100.8);
//				conta1.dar(50);
//				System.out.println(conta1.saldo());
//				ContaBancaria conta2 = new ContaBancaria();
//				System.out.println(conta2.saldo());
				
				Cliente cliente = new Cliente();
				
				cliente.setNome("Medina");
				cliente.setCpf(123456);
				cliente.setNumConta(33333);
				
				System.out.println(cliente.getNome());
				System.out.println(cliente.getCpf());
				System.out.println(cliente.getNumConta());
				
				System.out.println(cliente.toString());
				
				Cliente cliente2 = new Cliente();
				
				cliente2.setNome("Kelly");
				cliente2.setCpf(123456);
				cliente2.setNumConta(33333);
				
				//cliente2 = cliente;
				
				System.out.println(cliente2);
				
				
				if(cliente.getNome() == cliente2.getNome()) {
					System.out.println("Os nomes são iguais");
				}
				else {
					System.out.println("Os nomes são diferentes");
				}
				
				if(cliente == cliente2) {
					System.out.println("Os objetos são iguais");
				}
				else {
					System.out.println("Os objetos são diferentes");
				}
				
				if(cliente.equals(cliente2)) {
					System.out.println("Os objetos são iguais");
				} 
				else {
					System.out.println("Os objetos são diferentes");
				}
				
				
			}

		


}


