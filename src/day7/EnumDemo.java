package day7;

public class EnumDemo {
	public static void main(String[] args) {
		MyFirstEnum mfe;
		for (MyFirstEnum m : MyFirstEnum.values()) {
			System.out.println(m + ":" + m.marks);
		}
		EnumDemo obj = new EnumDemo();
		obj.processEnum(MyFirstEnum.ramu);
	}

	public void processEnum(MyFirstEnum mfe) {
		switch (mfe) {
		case ramu: {
			System.out.println("ramu...");
			break;
		}
		case somu: {
			System.out.println("somu...");
			break;
		}
		}
	}
}
