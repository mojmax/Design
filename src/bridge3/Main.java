package bridge3;

public class Main {
	
		public static void main(String[] args){
			TVInterface tv = new SonyTv();
			AbstractRemoteControl lrc = new LogitechRemoteControl(tv);
			lrc.setChannel(100);
			AbstractRemoteControl meliconi = new MeliconiRemoteControl(new SamsungTV());
			meliconi.turnOn();
			meliconi.setChannel(2);
			meliconi.turnOff();
		}
	

}
