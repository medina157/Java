import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
	
//		List lista = new ArrayList(); // construindo o objeto do tipo arraylist
//		
//		lista.add("abc");
//		lista.add(12);
//		lista.add(true);
//		for(int x=0; x < lista.size(); x++) {
//		System.out.println(lista.get(x));
//		}
//		System.out.println("------------------------");
//		
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println("------------------------");
//		lista.remove(0); //remove o valor que esta dentro da posição descrita 
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println("------------------------");
//		lista.add(0, "def"); // empurra os valores que estao na posição e se adiciona 
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println("------------------------");
//		lista.set(0, "ghi");//set apaga o valor que esta na posição descrita e adiciona um novo valor
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println("------------------------");
//		lista.clear();// faz com que fique vazio
//		if(lista.isEmpty()) { //mostra uma mensagem na tela caso esteja vazio 
//			System.out.println("Sua lista esta vazia ");
//		}
		Conta conta1 = new Conta("Àgua", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);
	
		List<Conta> ListaDeContas = new ArrayList<Conta>();
		
		ListaDeContas.add(conta1);
		ListaDeContas.add(conta2);
		
		for(Conta Conta : ListaDeContas) {
			System.out.println(Conta);
		}
		
	}
	
}

