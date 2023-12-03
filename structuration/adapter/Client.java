package adapter;

public class Client {
	public static void main(String[] args) {
		//Creation de l'objet Adaptee
		Adaptee adaptee = new Adaptee();
		//Creation de l'objet Adaptateur avec l'Adaptee en parametre
		Interface new_interface = new Adaptateur(adaptee);
		
		//Appel de la methode service via l'interface
		new_interface.service();
	}
}

//Client.java