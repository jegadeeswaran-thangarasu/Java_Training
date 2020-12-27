package day4;
public class BadFan {
	int state;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state....");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state.....");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state......");
			state=0;
		}
	}
}




