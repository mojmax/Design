package proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {
	boolean adminProfile;
	CommandExecutor executor = new CommandExecutorImpl();
	public CommandExecutorProxy(String user) {
		if (user.equals("Moj")) {
			adminProfile = true;
		} else {
			adminProfile = false;
		}
	}
	@Override
	public void runCommand(String command) throws Exception {
		if ( command.startsWith("cmd") ) {
			if (adminProfile ) {
				execute(command);
			} else {
				throw new Exception("rm command is not allowed for nonadmin users.");
				
			}
			
		} else {
			execute(command);
		}
	}
	
	private void execute(String command) {
		try {
			executor.runCommand(command);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
