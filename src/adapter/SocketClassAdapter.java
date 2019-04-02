package adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter {

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convert(v,10.0d);
	}

	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return convert(v,40.0d);	
	}

	@Override
	public Volt get120Volt() {
		Volt v = getVolt();
		return convert(v,2.0d);	
	}

	@Override
	public Volt get240Volt() {
		Volt v = getVolt();
		return convert(v,0.5d);
	}

	private Volt convert(Volt volt, double i) {
		return new Volt((int) (volt.getVolt()/i));
	}

}
