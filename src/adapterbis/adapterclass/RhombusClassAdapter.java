package adapterbis.adapterclass;

import adapterbis.Shape;
import adapterbis.external.Rhombus;


public class RhombusClassAdapter extends Rhombus implements Shape {

	@Override
	public void draw() {
		drawShape();
	}

	@Override
	public void resize() {
		System.out.println(description() + " can't be resized. Please create new one with required values.");
		
	}

	@Override
	public String description() {
		return "is An adapted  " + super.getClass();
	}

	@Override
	public boolean isHide() {
	
		return false;
	}

}
