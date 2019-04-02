package command2;

import java.util.ArrayList;
import java.util.List;

public class PulsantInvoker {
	private List<Command> commands = new ArrayList<Command>();
	public void addCommand(Command c) {
		this.commands.add(c);
	}
	public void removeCommand(Command c) {
		this.commands.remove(c);
	}
	public void executeCommands() {
		for ( Command c:commands ){
			c.execute();
		}
	}

}
