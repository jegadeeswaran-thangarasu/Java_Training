package myPractice;

public class TemplateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DominosPizza domino = new JegadeesDominosPizza();
		domino.orderPizza();
	}
}

abstract class DominosPizza {
	public abstract void clean();
	public abstract void wearCookingDress();
	public abstract void processIngredients();
	public abstract void processWheat();
	final public void orderPizza() {
		clean();
		wearCookingDress();
		processIngredients();
		processWheat();
	}
}

class JegadeesDominosPizza extends DominosPizza {

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("cleaning work in process....");
	}

	
	@Override
	public void wearCookingDress() {
		// TODO Auto-generated method stub
		System.out.println("wear cooking dress...");
	}

	@Override
	public void processIngredients() {
		// TODO Auto-generated method stub
		System.out.println("process ingredients....");
	}

	@Override
	public void processWheat() {
		// TODO Auto-generated method stub
		System.out.println("process wheat....");
	}
	
}