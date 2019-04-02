package decorator;

public class SportsCar extends CarDecorator {
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		car.assemble();
	}
}