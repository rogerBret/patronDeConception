package new_bridge2;

public class BridgeDesignPatternMain {
	public static void main(String[] args) {
		Shape s1 = new Rectangle(new RedColor());
		s1.colorlt();
		Shape s2 = new Circle(new BlueColor());
		s2.colorlt();
		Shape s3 = new Rectangle (new YellowColor());
		s3.colorlt();
	}
}
