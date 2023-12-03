package decorator;

public class DecorateurConcretB extends Decorateur {
	private ComposantAbstrait composant;
	
	public DecorateurConcretB(ComposantAbstrait composant) {
		this.composant = composant;
	}
	
	public void operation() {
		System.out.println("DecorateurConcretB_operation()");
		composant.operation();
	};
	public void autreoperation() {
		System.out.println("DecorateurConcretB_autreoperation()");
	};
}
