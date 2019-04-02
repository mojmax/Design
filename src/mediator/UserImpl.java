package mediator;

public class UserImpl extends User {

	public UserImpl(Mediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		med.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.print(this.getName() + " recive " + msg);
	}

}
