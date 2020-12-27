package day5;

public class AdapterDemo {
	public static void main(String[] args) {
		HpAmericanPlug hpplug = new HpAmericanPlug();
		SakthiSocket shakthi = new SakthiSocket();
		// shakthi.roundPinHole(hpplug);
		IndianAdapter ia = new IndianAdapter();
		ia.setAp(hpplug);
		shakthi.roundPinHole(ia);
	}
}

class IndianAdapter extends IndianPlug {
	AmericanPlug ap;

	public void setAp(AmericanPlug ap) {
		this.ap = ap;
	}

	@Override
	public void roundPin() {
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
		System.out.println("american slab pin working");
	}

}

class SakthiSocket extends IndianSocket {
	@Override
	public void roundPinHole(IndianPlug ip) {
		// TODO Auto-generated method stub
		ip.roundPin();
	}
}
/*
 * public class AdapterDemo { public static void main(String[] args) {
 * HpAmericanPlug hpplug=new HpAmericanPlug(); ShakthiSocket shakthi=new
 * ShakthiSocket(); //shakthi.roundPinHole(hpplug); IndianAdapter ia=new
 * IndianAdapter(); ia.setAp(hpplug); shakthi.roundPinHole(ia); } } class
 * IndianAdapter extends IndianPlug{ AmericanPlug ap; public void
 * setAp(AmericanPlug ap) { this.ap=ap; }
 * 
 * @Override public void roundPins() { ap.slabPin(); } } abstract class
 * IndianSocket{ public abstract void roundPinHole(IndianPlug ip); } abstract
 * class IndianPlug{ public abstract void roundPins(); } abstract class
 * AmericanSocket{ public abstract void slabPinHole(AmericanPlug ap); } abstract
 * class AmericanPlug { public abstract void slabPin(); } class HpAmericanPlug
 * extends AmericanPlug{
 * 
 * @Override public void slabPin() {
 * System.out.println("american slab pin working...."); } } class ShakthiSocket
 * extends IndianSocket{
 * 
 * @Override public void roundPinHole(IndianPlug ip) { ip.roundPins(); } }
 */