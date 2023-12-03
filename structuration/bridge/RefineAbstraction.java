package bridge;

public class RefineAbstraction extends Abstraction {
	public RefineAbstraction(Implementor implementor) {
		super(implementor);
	}
	
	public void operation() {
		System.out.println("Operation pour RefineAbstraction");
		bridge.operationImpl();
	}
}

//RefineAbstraction