package decorator;

public class Client {

	public static void main(String[] args) {
		// Composant concret
        ComposantAbstrait composantConcret = new ComposantConcret();
        System.out.println("Composant concret :");
        composantConcret.operation();
        System.out.println();

        // Décorateur Concret A
        DecorateurConcretA decorateurA = new DecorateurConcretA(composantConcret);
        System.out.println("Composant avec décorateur A :");
        decorateurA.operation();
        System.out.println();

        // Décorateur Concret B
        DecorateurConcretB decorateurB = new DecorateurConcretB(composantConcret);
        System.out.println("Composant avec décorateur B :");
        decorateurB.operation();
        decorateurB.autreoperation();
    }

}
