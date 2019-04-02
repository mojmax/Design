package adapter;

public class SocketObjectAdapter implements SocketAdapter {
	private Socket socket = new Socket();
	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convert(v,10.0d);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convert(v,40.0d);	
	}

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get240Volt() {
		Volt v = socket.getVolt();
		return convert(v,0.5d);
	}

	private Volt convert(Volt volt, double i) {
		return new Volt((int) (volt.getVolt()/i));
	}

}
