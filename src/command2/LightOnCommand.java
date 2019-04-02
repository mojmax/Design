package command2;

public class LightOnCommand implements Command {
	private LightReceiver l;
	public LightOnCommand(LightReceiver l) {
		this.l = l;
	}
	public void execute() {
		System.out.println( this + ".execute()");
		l.lightOn();
	}
	public String toString() {
		return getClass().getSimpleName()  ;
		
	}

}
