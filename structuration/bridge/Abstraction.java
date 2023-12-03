package bridge;

public abstract class Abstraction {
	protected Implementor bridge;
	
	public Abstraction(Implementor implementor) {
		this.bridge = implementor;
	}
	public abstract void operation(); 
}

//Abstraction.java