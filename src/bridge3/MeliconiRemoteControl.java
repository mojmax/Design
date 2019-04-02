package bridge3;

public class MeliconiRemoteControl extends AbstractRemoteControl {

	public MeliconiRemoteControl(TVInterface tv) {
		super(tv);
	}

	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("Meliconi use keyword to set channel of " + getMarcaTv() );
	}
}
