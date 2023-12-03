package new_decorator;

public class Client {
    public static void main(String[] args) {
        // Création d'une fenêtre simple
        Fenetre fenetreSimple = new FenetreSimple();

        // Ajout du curseur horizontal à la fenêtre simple
        DecorateurCurseurHorizontal fenetreAvecCurseurHorizontal = new DecorateurCurseurHorizontal(fenetreSimple);
        afficherTypeFenetre("Fenêtre avec curseur horizontal");

        // Méthode dessiner
        System.out.println("Cette méthode est dessiner : Curseur Horizontal");
        fenetreAvecCurseurHorizontal.dessiner();

        // Méthode décrire
        System.out.println("Cette méthode est décrire : Curseur Horizontal");
        fenetreAvecCurseurHorizontal.decrire();

        System.out.println();

        // Ajout du curseur vertical à la fenêtre avec curseur horizontal
        DecorateurCurseurVertical fenetreAvecCurseurVertical = new DecorateurCurseurVertical(fenetreAvecCurseurHorizontal);
        afficherTypeFenetre("Fenêtre avec curseur vertical");

        // Méthode dessiner
        System.out.println("Cette méthode est dessiner : Curseur Vertical");
        fenetreAvecCurseurVertical.dessiner();

        // Méthode décrire
        System.out.println("Cette méthode est décrire : Curseur Vertical");
        fenetreAvecCurseurVertical.decrire();
    }

    private static void afficherTypeFenetre(String typefenetre) {
        System.out.println("=== " + typefenetre + " ===");
    }
}
