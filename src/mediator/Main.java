package mediator;

public class Main {
	public static void main(String[] args) {
		Mediator m = new MediatorImpl();
		User max = new UserImpl(m,"Max");
		User jon = new UserImpl(m,"Jhon");
		User olaf = new UserImpl(m,"Olaf");
		User manager = new SuperUserImpl(m, "Boss");
		m.addUser(max);
		m.addUser(jon);
		m.addUser(olaf);
		m.addUser(manager);
		
		max.send("ciao");
		manager.send("Lavorate" );
		User olga = new UserImpl(m,"Olga");
		m.addUser(olga);
		m.removeUser(olaf);
		
		olga.send("Ciao a tutti tranne olaf");
		
	}

}
