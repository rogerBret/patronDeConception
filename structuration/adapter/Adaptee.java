package adapter;

public class Adaptee {
	//Methode specifique a l'Adaptee
	public int service_specific() {
		System.out.println("Le service specifice adapte");
		return 0;
	}
}

//Adaptee.java