
public class Cachorro extends Animal { // extends significa que a classe cachorro esta estendendo de animal.

	@Override //  Reescre um metodo que foi herdado, onde a seu comportamento na classe pai é diferente do seu comportamento na classe filha,faz comq eles possuem o msm nome mas suas ações sejam distintas.
	public void Falar() {
		System.out.println("Au-Au");
	}
	
	public void Morder() {
		
		System.out.println("NHAC!!");
	}
	
	

}
