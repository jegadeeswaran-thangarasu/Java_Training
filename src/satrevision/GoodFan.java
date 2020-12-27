package satrevision;

public class GoodFan {
	State state = new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}

abstract class State {
	abstract void pull(GoodFan goodFan);
}

class SwitchOffState extends State {
	@Override
	void pull(GoodFan goodFan) {
		// TODO Auto-generated method stub
		System.out.println("switch on state...");
		goodFan.state = new SwitchOnState();
	}
}
class SwitchOnState extends State {
	@Override
	void pull(GoodFan goodFan) {
		// TODO Auto-generated method stub
		System.out.println("medium speed state...");
		goodFan.state = new MediumSpeedState();
	}
}
class MediumSpeedState extends State {
	@Override
	void pull(GoodFan goodFan) {
		// TODO Auto-generated method stub
		System.out.println("high speed state...");
		goodFan.state = new HighSpeedState();
	}
}

class HighSpeedState extends State {
	@Override
	void pull(GoodFan goodFan) {
		// TODO Auto-generated method stub
		System.out.println("switch off state...");
		goodFan.state = new SwitchOffState();
	}
}