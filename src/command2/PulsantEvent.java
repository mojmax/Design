package command2;

public class PulsantEvent {
	private PulsantInvoker invoker;

	public PulsantEvent(PulsantInvoker i) {
		this.invoker = i;
	}
	public void fireActions() { 
		invoker.executeCommands();
	}

}
