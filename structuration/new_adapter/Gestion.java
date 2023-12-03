package new_adapter;

public class Gestion {
	private Pile pile;
	
	public Gestion(Pile pile) {
		this.pile = pile;
	}
	
	public void push(Object o) {
		pile.push(o);
	}
	
	public Object pop() {
		return pile.pop();
	}
	
	public Object top() {
		return pile.top();
	}
}
