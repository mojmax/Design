package command2;

public class LightNeon implements LightReceiver {
	private boolean light ;  
	public void lightOn() {
		
		light = true ;
		System.out.println(this);
	}
	public void lightOff() {
		light = false ;
		System.out.println(this);
	}
	
	public String getStatus() {
		return light==true?"ON":"OFF";
	}
	public String toString() {
		return getClass() + " is " + getStatus() ;
	}
	
}
