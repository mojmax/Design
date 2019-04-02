package builder;

public class TestBuilder {
	public static void main(String[] args) {
		
		Computer c = new Computer.ComputerBuilder("500Mb", "16G","coreI7" ).build();
		System.out.println("bluetooth " + c.hasBluetooth() );
		System.out.println("whifi " + c.hasWhifi());
	}

}
