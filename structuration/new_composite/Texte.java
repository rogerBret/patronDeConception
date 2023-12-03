package new_composite;

public interface Texte {
	String titre = null;
	String preambule = null;
	public int longueur();
	public void ajout(Texte txt);
	public void retrait(int index);
}
