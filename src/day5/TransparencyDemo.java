package day5;

import java.util.Scanner;

public class TransparencyDemo {
	UniversalRemote myremote;
	public TransparencyDemo() {
		Tv tv = new Tv();
		SetTopBox stb = new SetTopBox();
		VGame vg = new VGame();
		SoundSystem ss = new SoundSystem();
		
		myremote = new UniversalRemote(tv,stb,vg,ss);
		
		Command fncc = new FatherNCCommand(tv,stb, vg,ss);
		Command fttc = new FatherTTCommand(tv,stb, vg,ss);
		Command fhgc = new FatherHGCommand(tv,stb, vg,ss);
		Command mscc = new MotherSCCommand(tv,stb, vg,ss);
		
		myremote.setCommand(fncc,1);
		myremote.setCommand(fttc,2);
		myremote.setCommand(fhgc,3);
		myremote.setCommand(mscc,4);
	}
	public static void main(String []args) {
		TransparencyDemo obj = new TransparencyDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("1.news, 2.tennis, 3.horse game, 4.serial");
		int slot = Integer.parseInt(scan.next());
		
		obj.myremote.runCommand(slot);
	}
}

class Tv {
	public void switchOn() {
		System.out.println("tv switch on...");
	}
	public void av1Mode() {
		System.out.println("switched to av1 mode...");
	}
}
class SetTopBox {
	public void newsChannel() {
		System.out.println("news...");
	}
	public void serialChannel() {
		System.out.println("serial...");
	}
}

class SoundSystem {
	public void highVolume() {
		System.out.println("high volume...");
	}
	public void lowVolume() {
		System.out.println("low volume...");
	}
}
 class VGame {
	 public void tennisGame() {
			System.out.println("tennis ...");
		}
		public void horseGame() {
			System.out.println("horse game...");
		}
 }
 
 // requirements
 // father news high 
 
 abstract class Command {
	 Tv tv;
	 SetTopBox stb;
	 VGame vg;
	 SoundSystem ss;
	 public Command(Tv tv, SetTopBox stb, VGame vg, SoundSystem ss) {
		super();
		this.tv = tv;
		this.stb = stb;
		this.vg = vg;
		this.ss = ss;
	}
	public abstract void execute();
 }
 class FatherNCCommand extends Command {
	public FatherNCCommand(Tv tv, SetTopBox stb, VGame vg, SoundSystem ss) {
		super(tv, stb, vg, ss);
	}
	@Override
	public void execute() {
		System.out.println("Father command news channel started...");
		System.out.println("please wait... we will show you...");
		tv.switchOn();
		stb.newsChannel();
		ss.highVolume();
		System.out.println("congrats news channel...");
	}
 }
class FatherTTCommand extends Command {
	public FatherTTCommand(Tv tv, SetTopBox stb, VGame vg, SoundSystem ss) {
		super(tv, stb, vg, ss);
	}
	@Override
	public void execute() {
		System.out.println("Father command vg started...");
		System.out.println("please wait... we will show you...");
		tv.av1Mode();
		vg.tennisGame();
		ss.highVolume();
		System.out.println("tennis...");
	}
}
 
class FatherHGCommand extends Command {
	public FatherHGCommand(Tv tv, SetTopBox stb, VGame vg, SoundSystem ss) {
		super(tv, stb, vg, ss);
	}
	@Override
	public void execute() {
		System.out.println("Father command vg started...");
		System.out.println("please wait... we will show you...");
		tv.av1Mode();
		vg.horseGame();
		ss.highVolume();
		System.out.println("congrats horse game...");
	}
}

class MotherSCCommand extends Command {
	public MotherSCCommand(Tv tv, SetTopBox stb, VGame vg, SoundSystem ss) {
		super(tv, stb, vg, ss);
	}
	@Override
	public void execute() {
		System.out.println("Mother command serial channel started...");
		System.out.println("please wait... we will show you...");
		tv.switchOn();
		stb.serialChannel();
		ss.lowVolume();
		System.out.println("congrats serial channel...");
	}
}

class DummyCommand extends Command {

	public DummyCommand(Tv tv, SetTopBox stb, VGame vg, SoundSystem ss) {
		super(tv, stb, vg, ss);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("I am dummy ....");
	}
	
}
class UniversalRemote {
	Command c[] = new Command[6];
	public UniversalRemote( Tv tv,SetTopBox stb, VGame vg, SoundSystem ss) {
		for(int i = 0; i < c.length;i++) {
			c[i] = new DummyCommand(tv,stb,vg,ss);
		}
	}
	public void setCommand(Command command,int slot) {
		c[slot] = command;
	}
	public void runCommand(int slot) {
		c[slot].execute();
	}
}