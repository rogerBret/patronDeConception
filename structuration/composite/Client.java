package composite;

public class Client {

	public static void main(String[] args) {
		Composite composite = new Composite();
		
		Component leaf1 = new Leaf();
		composite.getComponent();
		
		Composite composite2 = new Composite();
		composite2.getComponentcount();
		composite.getComponent();
		
		composite.operation1();
		composite.operation2();
		
		leaf1.operation1();
		leaf1.operation2();

	}

}
