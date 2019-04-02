package command2;

public class LightOffCommand implements Command {
	private LightReceiver l;
	public LightOffCommand(LightReceiver l) {
		this.l = l;
	}
	public void execute() {
		System.out.println( this + ".execute()");
		l.lightOff();
	}
	public String toString() {
		return getClass().getSimpleName()  ;
		
	}
}
