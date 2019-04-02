package factory;

public class TestFactory {
	
	public static void main(String[] args) {
		Computer c = ComputerFactory.getComputer("PC","16Mb", "1tb", "CoreI7");
		System.out.println("Computer " + c.getCpu());
		System.out.println("Computer " + c.getHdd());
		System.out.println("Computer " + c.getRam());
		if ( c.getClass() ==   Pc.class) {
			System.out.println("PC");
		} else { 
			
		}
	}

}
