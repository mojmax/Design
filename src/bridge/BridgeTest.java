package bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Shape s1 = new Pentagon(new RedColor());
		Shape s2 = new Triangle(new GreenColor());
		Shape s3 = new Pentagon(new GreenColor());
		s1.applyColor();
		s3.applyColor();
		s2.applyColor();
	}

}
