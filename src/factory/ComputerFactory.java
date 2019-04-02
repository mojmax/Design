package factory;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		switch (type) {
		case "PC":
			return new Pc(ram, hdd, cpu);
		case "Server":
			return new Server(ram, hdd, cpu);
		default:
			return null;
		}
	}
}
