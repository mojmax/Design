package mediator;

public abstract class User {
	
	public Mediator med;
	public String name;
	
	public User(Mediator med, String name) {
		this.med = med;
		this.name = name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
	
	public String getName() {
		return this.name;
	}; 
}
