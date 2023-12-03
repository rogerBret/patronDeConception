package new_adapter;

public class Client {
    public static void main(String[] args) {
        Pile pile = new Adaptateur();

        // Utilisation de la pile
        pile.push(1);
        pile.push(2);
        pile.push(3);

        System.out.println("Top of the stack: " + pile.top());

        Object poppedItem = pile.pop();
        System.out.println("Popped item: " + poppedItem);
        System.out.println("Top of the stack after pop: " + pile.top());
    }
}