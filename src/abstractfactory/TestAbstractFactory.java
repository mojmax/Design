package abstractfactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PcFactory("16Mb", "1Tb", "CoreI7"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("32Mb", "10Tb", "Xenon"));
		System.out.println("pc : " + pc);
		System.out.println("server : " + server);
	}

}
