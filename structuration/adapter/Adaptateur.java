package adapter;

public class Adaptateur implements Interface {
	private Adaptee adaptee;
	
	//Constructeur prenant un objet Adaptee a adapter
	public Adaptateur(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	//Implementation de la methode service de l'interface
	public int service() {
		//Appel de la methode service_specific de l'Adaptee
		adaptee.service_specific();
		return 0;
	}
}

//Adaptateur.java
