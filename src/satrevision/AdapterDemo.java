package satrevision;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HpAmericanPlug hpp = new HpAmericanPlug();
		SakthiSocket ss = new SakthiSocket();
		//ss.roundPinHole(hpp);
		IndianAdapter ia = new IndianAdapter();
		ia.setUp(hpp);
		ss.roundPinHole(ia);
	}
}

class IndianAdapter extends IndianPlug {

	AmericanPlug ap;
	public void setUp(AmericanPlug ap) {
		this.ap = ap;
	}
	@Override
	public void roundPin() {
		// TODO Auto-generated method stub
		ap.slabPins();
	}
}

abstract class IndianPlug {
	abstract public void roundPin();
}

abstract class IndianSocket {
	abstract public void roundPinHole(IndianPlug ip);
}

abstract class AmericanPlug {
	abstract public void slabPins();
}

class HpAmericanPlug extends AmericanPlug {

	@Override
	public void slabPins() {
		// TODO Auto-generated method stub
		System.out.println("slab pins working");
	}
}

class SakthiSocket extends IndianSocket {
	@Override
	public void roundPinHole(IndianPlug ip) {
		// TODO Auto-generated method stub
		ip.roundPin();
	}
}
