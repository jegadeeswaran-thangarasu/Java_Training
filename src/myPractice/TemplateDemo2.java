package myPractice;

public class TemplateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

class JegadeesDominosPizza2 extends DominosPizza2 {

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("cleaning process...");
	}

	@Override
	public void wearCookingDress() {
		// TODO Auto-generated method stub
		System.out.println("wear cooking dress....");
	}

	@Override
	public void processIngredients() {
		// TODO Auto-generated method stub
		System.out.println("process ingredients...");
	}

	@Override
	public void processWheat() {
		// TODO Auto-generated method stub
		System.out.println("process wheat...");
	}
	
}