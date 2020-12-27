package satrevision;

public class TemplateDemo2 {
	public static void main(String[] args) {
		DominosPizza2 domino = new JegadeesDominosPizza2();
		domino.orderPizza();
	}
}

abstract class DominosPizza2 {
	public abstract void clean();
	public abstract void wearCookingDress();
	public abstract void processIngredients();
	public abstract void processWheat();
	final public void cooking() {
		System.out.println("secret cooking method....");
	}
	final public void orderPizza() {
		clean();
		wearCookingDress();
		processIngredients();
		processWheat();
		cooking();
	}
}
class JegadeesDominosPizza2 extends DominosPizza2 {

	public JegadeesDominosPizza2() {
		System.out.println("jegadees dominos pizza object created...");
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
		System.out.println("process wheat in process...");
	}
}