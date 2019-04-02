package decorator;

public class LuxuryCar extends CarDecorator {
	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		car.assemble();
	}
}