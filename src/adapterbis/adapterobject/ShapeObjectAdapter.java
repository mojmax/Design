package adapterbis.adapterobject;

import adapterbis.Shape;
import adapterbis.external.GeometricShape;

public class ShapeObjectAdapter implements Shape {
	private GeometricShape shape;
	public ShapeObjectAdapter(GeometricShape s) {
		super();
		shape = s;
	}

	@Override
	public void draw() {
		shape.drawShape();
	}

	@Override
	public void resize() {
		System.out.println(description() + " can't be resized. Please create new one with required values.");
		
	}

	@Override
	public String description() {
		
		return " is a : " + shape.getClass().toString();
	}

	@Override
	public boolean isHide() {
		
		return false;
	}

}
