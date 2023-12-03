package composite;

public class Composite implements Component {
	public void operation1() {
		System.out.println("Composite_operation1()");
	};
	public void operation2() {
		System.out.println("Composite_operation2()");
	};
	public void removeComponent() {
		System.out.println("Composite_removeComponent()");
	};
	public void getComponent() {
		System.out.println("Composite_getComponent()");
	};
	public void getComponentcount() {
		System.out.println("Composite_getComponentCount()");
	};
}
