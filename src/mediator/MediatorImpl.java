package mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
	private List<User> users;
	public MediatorImpl() {
		users = new ArrayList<>();
	}
	@Override
	public void sendMessage(String message, User sender) {
		users.stream()
		// esclude sender
		.filter(e -> !e.getName().equals(sender.getName()) )
		.forEach(e -> e.receive(message));
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}
	
	@Override
	public void removeUser(User user) {
		users.remove(user);
	}


}
