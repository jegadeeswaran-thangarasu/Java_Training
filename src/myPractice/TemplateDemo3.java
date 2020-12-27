package myPractice;

public class TemplateDemo3 {
	public static void main(String[] args) {
		DominosPizza3 domino = new JegadeesDominosPizza3();
		domino.orderPizza();
	}
}

abstract class DominosPizza3 {
	public abstract void clean();
	public abstract void wearCookingDress();
	public abstract void processIngredients();
	public abstract void processWheat();
	final public void cooking() {
		System.out.println("secret cooking method...");
	}
	final public void orderPizza() {
		clean();
		wearCookingDress();
		processIngredients();
		processWheat();
		cooking();
	}
}
class JegadeesDominosPizza3 extends DominosPizza3 {

	public JegadeesDominosPizza3() {
		System.out.println("new object is created...");
	}
	@Override
	public void clean() {
		System.out.println("cleaning in process...");
	}

	@Override
	public void wearCookingDress() {
		System.out.println("wear cooking dress in process...");
	}

	@Override
	public void processIngredients() {
		System.out.println("process ingredients in process...");
	}

	@Override
	public void processWheat() {
		System.out.println("process wheat in process..");
	}
	
}