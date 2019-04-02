package command2;

public class LightFactory  {
	public static LightReceiver getLight(Light l){
		LightReceiver li;
		switch (l) {
		case NEON:
			li = new LightNeon();
			break;
		case TUNGSTENO:
			li = new LightTungsteno();
			break;

		default:
			li = new LightNeon();
			break;
		}
		return li;
	};

}
