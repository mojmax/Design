package template;

public class Main {

	public static void main(String[] args) {
		HouseBuilderInterface h1 = new GlassHouse();
		HouseBuilderInterface h2 = new WoodenHouse();
		h1.buildHouse();
		
		h2.buildHouse();
		
	}

}
