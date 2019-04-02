package abstractfactory;

public abstract class Computer {
	
	public abstract String getHdd();
	
	public abstract String getCpu();
	
	public abstract String getRam();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRam()+", HDD="+this.getHdd()+",CPU="+this.getCpu();
	}
	
}
