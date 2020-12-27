package day3;
import java.util.Scanner;
public class DogExercise {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception {
		Dog jimmy=new Dog();
		BabyChild baby=new BabyChild();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter either day3.Stick or day3.Stone as items..");
		String item=scan.next();
		
		Class c=Class.forName(item);
		Item itemObj=(Item)c.newInstance();
		baby.playWithDog(jimmy, itemObj);
	}
}
class Dog{
	public void play(Item item) {
		item.execute();
	}
}
abstract class Item{
	public abstract void execute();
}
class Stick extends Item{
	@Override
	public void execute() {
		System.out.println("you beat I bite........................");
	}
}
class Stone extends Item{
	@Override
	public void execute() {
		System.out.println("dont hit me............I run..........");
	}
}
class Biscuit extends Item{
	@Override
	public void execute() {
		System.out.println("yummy yummy I love biscuits....");
	}
}

class Chicken extends Item {
	
	public void execute() {
		System.out.println("i will finish it alone......");
	}
}
class BabyChild{
	public void playWithDog(Dog d,Item item) {
		d.play(item);
	} 
}



