package bridge;

public class Client {
	public static void main(String[] args) {
		Implementor implA = new ConcreteImplementorA();
		Abstraction abstraction = new RefineAbstraction(implA);
		abstraction.operation();
		
		Implementor implB = new ConcreteImplementorB();
		abstraction = new RefineAbstraction(implB);
		abstraction.operation();
	}

}
//Client
