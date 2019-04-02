package bridge3;

public class SonyTv implements TVInterface {


	@Override
	public void on() {
		System.out.println("Sony is turned on.");
	}
 
	@Override
	public void off() {
		System.out.println("Sony is turned off.");
	}
 
	@Override
	public void switchChannel(int channel) {
		System.out.println("Sony: channel - " + channel);
	}
	@Override
	public String getMarca() {
		return "Sony";
	}

}
