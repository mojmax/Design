package bridge3;

public  abstract class AbstractRemoteControl {
	
		/**
		 * @uml.property  name="tv"
		 * @uml.associationEnd  
		 */
		private TVInterface tv;
	 
		public AbstractRemoteControl(TVInterface tv){
			this.tv = tv;
		}
	 
		public void turnOn(){
			tv.on();
		}
	 
		public void turnOff(){
			tv.off();
		}
	 
		public void setChannel(int channel){
			tv.switchChannel(channel);
		}
		public String getMarcaTv( ) {
			return this.tv.getMarca();
		}
	

}
