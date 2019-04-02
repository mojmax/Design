package mediator;

public class SuperUserImpl extends User {
	
	public SuperUserImpl(Mediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		med.sendMessage("Super Message" + msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println("Super user " + getName() + " recive " + msg);

	}

}
