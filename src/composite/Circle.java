package composite;

public class Circle implements Shape {
	private String color;
	@Override
	public void draw(String color) {
		this.color = color;
		System.out.println("Circle colored " + color);
	}
	@Override 
	public void print() {
		System.out.println("Circle " + this + " " + color);
	}
	

}
