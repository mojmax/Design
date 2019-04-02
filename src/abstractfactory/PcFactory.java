package abstractfactory;

public class PcFactory implements ComputerAbstractFactory {
	
	private String hdd;
	private String cpu;
	private String ram;

	public PcFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Pc(hdd,cpu,ram);
	}

}
