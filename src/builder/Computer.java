package builder;

public class Computer {
	private String hdd;
	private String ram;
	private String cpu;
	//optional
	private boolean bluetooth;
	private boolean whifi;
	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.bluetooth = builder.bluetooth;
		this.whifi = builder.whifi;
	}
	public String getHdd() {
		return hdd;
	}
	
	public String getRam() {
		return ram;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public boolean hasBluetooth() {
		return bluetooth;
	}
	
	public boolean hasWhifi() {
		return whifi;
	}
	public static class ComputerBuilder {
		private String hdd;
		private String ram;
		private String cpu;
		private boolean whifi;
		private boolean bluetooth;
		
		
		public ComputerBuilder(String hdd, String ram, String cpu) {
			this.hdd = hdd;
			this.ram = ram;
			this.cpu = ram;
		}
		public ComputerBuilder bluetooth(boolean bluetooth) {
			this.bluetooth = bluetooth;
			return this;
		}
		public ComputerBuilder whifi(boolean whifi) {
			this.whifi = whifi;
			return this;
		}

		public Computer build() {
			Computer c = new Computer(this);
			return c;
			
		}
		
	}
	
}
