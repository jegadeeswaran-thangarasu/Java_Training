package day2;

public class PbvPbr {
	public static void main(String[] args) {
		Laddu laddu = new Laddu();
		laddu.size = 10;
		
		PBV pbv = new PBV();
		pbv.getLaddu(laddu.size);
		System.out.println("The size of the laddu after PBV is ...:"+laddu.size);
		
		PBR pbr = new PBR();
		pbr.getLaddu(laddu);
		System.out.println("The size of the laddu after PBR is ...:"+laddu.size);		
	}
}

class Laddu {
	int size;
}

class PBV {
	public void getLaddu(int size) {
		size = 5;
	}
}

class PBR {
	public void getLaddu(Laddu laddu) {
		laddu.size=5;
	}
}