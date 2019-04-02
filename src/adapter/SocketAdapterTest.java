package adapter;

public class SocketAdapterTest {
	public static void main(String[] args) {
		
		testClassAdapter();
		testObjAdapter();
		
	}
	private static void testClassAdapter() {
		SocketAdapter adaptClass = new SocketClassAdapter();
		Volt v = getVolt(adaptClass,3);
		System.out.println("v 3 volts using ObjectAdapter="+v.getVolt());
		v = getVolt(adaptClass,240);
		System.out.println("v 240 volts using ObjectAdapter="+v.getVolt());
		
	}
	private static void testObjAdapter() {
		SocketAdapter adaptObj = new SocketObjectAdapter();
		Volt v = getVolt(adaptObj,3);
		System.out.println("v 3 volts using ClassAdapter="+v.getVolt());
		v = getVolt(adaptObj,240);
		System.out.println("v 240 volts using ClassAdapter="+v.getVolt());
	}
	private static Volt getVolt(SocketAdapter socketAdapt,int i) {
		switch (i) {
		case 3:
			return socketAdapt.get3Volt();
		case 12:
			return socketAdapt.get12Volt();
		case 120:
			return socketAdapt.get120Volt();
		case 240:
			return socketAdapt.get240Volt();
		default:
			return socketAdapt.get120Volt();
		}
		
	}
}
