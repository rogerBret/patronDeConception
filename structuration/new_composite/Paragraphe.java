package new_composite;

public class Paragraphe implements Texte {
	
	public int longueur() {
		System.out.println("Methode Paragraphe_Longueur()");
		return 0;
	}
	
	public void ajout(Texte txt) {
		System.out.println("Methode Paragraphe_Ajout()");
	};
	
	public void retrait(int index) {
		System.out.println("Methode Paragraphe_Retrait()");
	}

}
