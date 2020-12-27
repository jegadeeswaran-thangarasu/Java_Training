package day4;
public class GoodFan {
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State {
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State{
	
	public void pull(GoodFan fan) {
		System.out.println("switch on state....");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	
	public void pull(GoodFan fan) {
		System.out.println("medium speed state....");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State {
	
	public void pull(GoodFan fan) {
		System.out.println("high speed state....");
		fan.state = new HighSpeedState();
	}
}
class HighSpeedState extends State{
	
	public void pull(GoodFan fan) {
		System.out.println("switch off state....");
		fan.state=new SwitchOffState();
	}
}
