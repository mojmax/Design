package composite;

public class TestComposite {
	
	public static void main(String[] args) {
		Drawing d = new Drawing();
		Triangle t = new Triangle();
		Triangle t1 = new Triangle();
		Circle c = new Circle();
		d.add(t);
		d.add(t1);
		d.add(c);
		d.draw("red");
		d.print();
		d.remove(t1);
		d.draw("green");
		d.print();
	}

}
