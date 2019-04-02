package command2;

public abstract class LightAbstractCommand implements Command {
	LightReceiver l;
	public LightAbstractCommand(LightReceiver l) {
		this.l = l;
	};
	
}
