package command2;

public class Client {
	public static void main(String[] args) {
		
		LightReceiver l = LightFactory.getLight(Light.TUNGSTENO);
		
		Command cOff = new LightOffCommand(l);
		Command cOn = new LightOnCommand(l);
		Command cBlink = new LightAbstractCommand(l)  {
			public void execute() {
				System.out.println( this);
				l.lightOff();
				l.lightOn();
				l.lightOff();
			}
			public String toString() {
				Class c = getClass();
				return 	c + "" ;
			}
		};
		
		PulsantInvoker puls = new PulsantInvoker();	
		puls.addCommand(cOff);
		puls.addCommand(cOn);
		puls.addCommand(cBlink);
		puls.addCommand(new LightOnCommand(l));
		puls.addCommand(new LightAbstractCommand(l)  {
			public void execute() {
				System.out.println( this);
				l.lightOff();
				l.lightOn();
				l.lightOff();
				l.lightOff();
			}
			public String toString() {
				return "LightAbstractCommand";
			}
		});
		//puls.executeCommands();
		// simulo l'innesco di un evento sull oggetto
		PulsantEvent event = new PulsantEvent(puls);
		event.fireActions();
	}
}
