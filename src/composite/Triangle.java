package composite;

public class Triangle implements Shape {
	private String color;
	@Override
	public void draw(String color) {
		this.color = color;
		System.out.println("Triangle colored " + color);
	}
	@Override 
	public void print() {
		System.out.println("Triangle " + this + " " + color);
	}

}
