package new_composite;

public class Client {
    public static void main(String[] args) {
        // Création d'instances de Section et Paragraphe
        Section section = new Section("Titre de la section", "Preambule de la section");
        Paragraphe paragraphe = new Paragraphe();

        // Appels de méthodes sur les instances
        section.longueur();
        section.ajout(paragraphe);
        section.retrait(1);

        paragraphe.longueur();
        paragraphe.ajout(section);
        paragraphe.retrait(2);
    }
}
