package decorator;

public class DecorateurConcretA extends Decorateur {
	private ComposantAbstrait composant;
	
	public DecorateurConcretA(ComposantAbstrait composant) {
		this.composant = composant;
	}
	
	public void operation() {
		System.out.println("DecorateurConcretA_operation()");
		composant.operation();
	};
}
