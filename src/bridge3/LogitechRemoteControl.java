package bridge3;

public class LogitechRemoteControl extends AbstractRemoteControl {
	 
	public LogitechRemoteControl(TVInterface tv) {
		super(tv);
	}
	@Override
	public void setChannel(int channel){
		super.setChannel(channel);
		System.out.println("Logitech use keyword to set channel of " + getMarcaTv() );
	}
}