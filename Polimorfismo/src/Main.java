
public class Main {

	public static void main(String[] args) {
	
//		Animal animal = new Cachorro();
//		animal.Falar();
//		
//		animal = new Gato();
//		animal.Falar();
//		
		Gato gato=new Gato(); 
		Cachorro cachorro = new Cachorro();
		falar(gato);
		falar(cachorro);
	}
	public static void falar(Animal a) {
		a.Falar();
		
		if(a instanceof Cachorro){  // if significa "se", por exemplo: se cachorro for grande ele latira mais fort que um bebe
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
		
		
	}

}
