package new_composite;

public class Section implements Texte {
	private String titre;
	private String preambule;
	
	public Section(String titre, String preambule) {
		this.titre = titre;
		this.preambule = preambule;
	};
	
	public int longueur() {
		System.out.println("Methode Section_Longueur()");
		return 0;
	};
	public void ajout(Texte txt) {
		System.out.println("Methode Section_Ajout()");
	};
	public void retrait(int index) {
		System.out.println("Methode Section_Retrait()");
	};
}
