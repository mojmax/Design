package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<ShapeType,Shape> shapes = new HashMap<ShapeType,Shape> ();
	public static Shape getShape(ShapeType type) {
		Shape shape = shapes.get(type);
		if ( shape==null ) {
			switch (type) {
			case OVAL_NOFILL:
				 shape = new Oval(false);
				break;
			case OVAL_FILL:
				 shape = new Oval(true);
				break;
			case LINE:
				shape = new Line();
				break;
			default:
				break;
			} 
			shapes.put(type, shape);	
		}
		return shape;
	}

	enum ShapeType {
		OVAL_NOFILL,
		LINE,
		OVAL_FILL;
	}
}
