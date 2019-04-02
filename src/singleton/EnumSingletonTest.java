package singleton;

public class EnumSingletonTest {
	public static void main(String[] args) {
		
		EnumSingleton t = EnumSingleton.INSTANCE;
		EnumSingleton t2 = EnumSingleton.INSTANCE;
		
		EnumSingleton b = EnumSingleton.INSTANCE2;
		EnumSingleton b2 = EnumSingleton.INSTANCE2;
		
		t.setNum(22);
		t.setName("Massimo");
		
		b.setNum(52);
		b.setName("Mojetta");
		b2.setNum(53);
		b2.setName("Mojetta");
		
		System.out.println("num : " + t.getNum() );
		System.out.println("name : " + t.getName() );
		System.out.println("num : " + t2.getNum() );
		System.out.println("name : " + t2.getName() );
		
		System.out.println(" ");
		
		System.out.println("num : " + b.getNum() );
		System.out.println("name : " + b.getName() );
		System.out.println("num : " + b2.getNum() );
		System.out.println("name : " + b2.getName() );
		
	}

}
