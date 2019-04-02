package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	private List<Shape> list = new ArrayList<Shape>();

	@Override
	public void draw(String color) {
		for(Shape s:list) {
			s.draw(color);
		}
	}
	public void add(Shape s) {
		list.add(s);
	}
	public void remove(Shape s) {
		list.remove(s);
		System.out.println("remove" + s);
	}
	public void clear() {
		list.clear();
		System.out.println("Clearing all the shapes from drawing");
	}
	@Override
	public void print() {
		for(Shape s:list) {
			s.print();
		}
	}
}
