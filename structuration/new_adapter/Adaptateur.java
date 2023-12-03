package new_adapter;

public class Adaptateur extends DList implements Pile {
	public void push(Object o) {
		insertTail(o);
	}
	public Object pop() {
		return removeTail();
	}
	public Object top() {
		return getTail();
	}
}
