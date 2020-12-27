package day8;

public class ObjectManagement {
	public static void main(String[] args) {
		Sheep sheep1 = new Sheep();
		Sheep sheep2 = new Sheep();//multiton
		//Sheep sheep3 = sheep2; //singleton
		Sheep sheep3 = sheep2.createColone();
		
		sheep1.name = "first sheep";
		sheep2.name = "second sheep";
		sheep3.name = "third sheep";
		System.out.println(sheep1.name+":"+sheep2.name);
	}
}

class Sheep implements Cloneable {
	public Sheep() {
		System.out.println("sheep object is created..");
	}
	public String name;
	public Sheep createColone() {
		try {
			return (Sheep)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
} 