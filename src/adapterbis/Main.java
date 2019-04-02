package adapterbis;

import adapterbis.adapterclass.RhombusClassAdapter;
import adapterbis.adapterclass.TriangleClassAdapter;
import adapterbis.adapterobject.ShapeObjectAdapter;
import adapterbis.external.Rhombus;
import adapterbis.external.Triangle;

public class Main {
	public static void main(String[] args) {
		System.out.println("Creating drawing of shapes...");
		Drawing drawing = new Drawing();
		drawing.addShape(new Rectangle());
		drawing.addShape(new Circle());
		drawing.addShape(new ShapeObjectAdapter(new Triangle()));
		drawing.addShape(new ShapeObjectAdapter(new Rhombus()));
		drawing.addShape(new TriangleClassAdapter());
		drawing.addShape(new RhombusClassAdapter());
		System.out.println("Drawing...");
		drawing.draw();
		System.out.println("Resizing...");
		drawing.resize();
	}
}